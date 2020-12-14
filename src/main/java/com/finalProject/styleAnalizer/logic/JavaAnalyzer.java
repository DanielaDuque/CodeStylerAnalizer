package com.finalProject.styleAnalizer.logic;

import com.finalProject.styleAnalizer.gen.javaGrammarBaseListener;
import com.finalProject.styleAnalizer.gen.javaGrammarParser;
import com.finalProject.styleAnalizer.pojo.RequestPOJO;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class JavaAnalyzer extends javaGrammarBaseListener {
    private List<ErrorStyle> errors;
    private EnglishDictionarySingleton dictionarySingleton;
    private RequestPOJO pojo;
    private Logger logger = LoggerFactory.getLogger(JavaAnalyzer.class);

    public JavaAnalyzer(RequestPOJO pojo) {
        this.errors = new ArrayList<>();
        this.pojo = pojo;
        this.dictionarySingleton = EnglishDictionarySingleton.getInstance();
    }

    public List<ErrorStyle> getErrors() {
        return errors;
    }

    void checkIdentifier(String identifierType, TerminalNode identifier) {
        String error = "The " + identifierType + " " + identifier;
        String text = identifier.getText();
        int line = identifier.getSymbol().getLine();
        int column = identifier.getSymbol().getStartIndex();

        if (text.length() > pojo.getMaxNameLength()) {
            errors.add(new ErrorStyle(error + " exceed the max length constraint, max length " + pojo.getMaxNameLength(), line, column));
            return;
        }
        if (text.contains("_")) {
            errors.add(new ErrorStyle(error + " has not the correct java style", line, column, true, text, convertToCamel(identifierType, text)));
            return;
        }
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isAlphabetic(text.charAt(i))) {
                errors.add(new ErrorStyle(error + " not contains only letters", line, column));
                return;
            }
            if (Character.isUpperCase(text.charAt(i))) {
                if (word.length() == 0 && words.size() == 0) {
                    if(!isStruct(identifierType)){
                        errors.add(new ErrorStyle(error + " has not the correct java style", line, column, true, text, convertToCamel(identifierType, text)));
                        return;
                    }
                    word.append(text.charAt(i));
                } else {
                    if (dictionarySingleton.checkIfExists(word.toString())) {
                        words.add(word.toString());
                        word = new StringBuilder();
                        word.append(text.charAt(i));
                    } else {
                        logger.debug(word.toString());
                        errors.add(new ErrorStyle(error + " has an english syntax error", line, column));
                        return;
                    }
                }
            } else {
                if (word.length() == 0 && words.size() == 0 && isStruct(identifierType)) {
                    errors.add(new ErrorStyle(error + " has not the correct java style", line, column, true, text, convertToCamel(identifierType, text)));
                    return;
                }
                word.append(text.charAt(i));
            }
        }
        if(word.length() > 0){
            if (!dictionarySingleton.checkIfExists(word.toString())) {
                logger.debug(word.toString());
                errors.add(new ErrorStyle(error + word.toString() + " has an english syntax error", line, column));
                return;
            }
        }
    }

    String convertToCamel(String identifierType, String text) {
        String[] words = text.split("_");
        StringBuilder finalIdentifier = new StringBuilder();
        for (String word : words) {
            List<String> innerWords = new ArrayList<>();
            StringBuilder currentWord = new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i)) && currentWord.length() > 0){
                    innerWords.add(currentWord.toString());
                    currentWord = new StringBuilder();
                    currentWord.append(word.charAt(i));
                }else{
                    currentWord.append(word.charAt(i));
                }
            }
            if(currentWord.length() > 0){
                innerWords.add(currentWord.toString());
            }
            for(String innerWord: innerWords){
                String lowerWord = innerWord.toLowerCase();
                for (int i = 0; i < lowerWord.length(); i++) {
                    if (i == 0 && (finalIdentifier.length() > 0 || isStruct(identifierType))) {
                        finalIdentifier.append((lowerWord.charAt(i) + "").toUpperCase());
                    } else {
                        finalIdentifier.append(lowerWord.charAt(i));
                    }
                }
            }
        }
        return finalIdentifier.toString();
    }

    boolean isStruct(String identifierType){
        return identifierType.equals("class") || identifierType.equals("interface") || identifierType.equals("enum") || identifierType.equals("annotation");
    }

    @Override
    public void enterCompilationUnit(javaGrammarParser.CompilationUnitContext ctx) {
        super.enterCompilationUnit(ctx);
    }

    @Override
    public void exitCompilationUnit(javaGrammarParser.CompilationUnitContext ctx) {
        super.exitCompilationUnit(ctx);
    }

    @Override
    public void enterPackageDeclaration(javaGrammarParser.PackageDeclarationContext ctx) {
        super.enterPackageDeclaration(ctx);
    }

    @Override
    public void exitPackageDeclaration(javaGrammarParser.PackageDeclarationContext ctx) {
        super.exitPackageDeclaration(ctx);
    }

    @Override
    public void enterImportDeclaration(javaGrammarParser.ImportDeclarationContext ctx) {
        super.enterImportDeclaration(ctx);
    }

    @Override
    public void exitImportDeclaration(javaGrammarParser.ImportDeclarationContext ctx) {
        super.exitImportDeclaration(ctx);
    }

    @Override
    public void enterTypeDeclaration(javaGrammarParser.TypeDeclarationContext ctx) {
        super.enterTypeDeclaration(ctx);
    }

    @Override
    public void exitTypeDeclaration(javaGrammarParser.TypeDeclarationContext ctx) {
        super.exitTypeDeclaration(ctx);
    }

    @Override
    public void enterModifier(javaGrammarParser.ModifierContext ctx) {
        super.enterModifier(ctx);
    }

    @Override
    public void exitModifier(javaGrammarParser.ModifierContext ctx) {
        super.exitModifier(ctx);
    }

    @Override
    public void enterClassOrInterfaceModifier(javaGrammarParser.ClassOrInterfaceModifierContext ctx) {
        super.enterClassOrInterfaceModifier(ctx);
    }

    @Override
    public void exitClassOrInterfaceModifier(javaGrammarParser.ClassOrInterfaceModifierContext ctx) {
        super.exitClassOrInterfaceModifier(ctx);
    }

    @Override
    public void enterVariableModifier(javaGrammarParser.VariableModifierContext ctx) {
        super.enterVariableModifier(ctx);
    }

    @Override
    public void exitVariableModifier(javaGrammarParser.VariableModifierContext ctx) {
        super.exitVariableModifier(ctx);
    }

    @Override
    public void enterClassDeclaration(javaGrammarParser.ClassDeclarationContext ctx) {
        super.enterClassDeclaration(ctx);
        checkIdentifier("class", ctx.IDENTIFIER());
    }

    @Override
    public void exitClassDeclaration(javaGrammarParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx);
    }

    @Override
    public void enterTypeParameters(javaGrammarParser.TypeParametersContext ctx) {
        super.enterTypeParameters(ctx);
    }

    @Override
    public void exitTypeParameters(javaGrammarParser.TypeParametersContext ctx) {
        super.exitTypeParameters(ctx);
    }

    @Override
    public void enterTypeParameter(javaGrammarParser.TypeParameterContext ctx) {
        super.enterTypeParameter(ctx);
    }

    @Override
    public void exitTypeParameter(javaGrammarParser.TypeParameterContext ctx) {
        super.exitTypeParameter(ctx);
    }

    @Override
    public void enterTypeBound(javaGrammarParser.TypeBoundContext ctx) {
        super.enterTypeBound(ctx);
    }

    @Override
    public void exitTypeBound(javaGrammarParser.TypeBoundContext ctx) {
        super.exitTypeBound(ctx);
    }

    @Override
    public void enterEnumDeclaration(javaGrammarParser.EnumDeclarationContext ctx) {
        super.enterEnumDeclaration(ctx);
        checkIdentifier("enum", ctx.IDENTIFIER());
    }

    @Override
    public void exitEnumDeclaration(javaGrammarParser.EnumDeclarationContext ctx) {
        super.exitEnumDeclaration(ctx);
    }

    @Override
    public void enterEnumConstants(javaGrammarParser.EnumConstantsContext ctx) {
        super.enterEnumConstants(ctx);
    }

    @Override
    public void exitEnumConstants(javaGrammarParser.EnumConstantsContext ctx) {
        super.exitEnumConstants(ctx);
    }

    @Override
    public void enterEnumConstant(javaGrammarParser.EnumConstantContext ctx) {
        super.enterEnumConstant(ctx);
    }

    @Override
    public void exitEnumConstant(javaGrammarParser.EnumConstantContext ctx) {
        super.exitEnumConstant(ctx);
    }

    @Override
    public void enterEnumBodyDeclarations(javaGrammarParser.EnumBodyDeclarationsContext ctx) {
        super.enterEnumBodyDeclarations(ctx);
    }

    @Override
    public void exitEnumBodyDeclarations(javaGrammarParser.EnumBodyDeclarationsContext ctx) {
        super.exitEnumBodyDeclarations(ctx);
    }

    @Override
    public void enterInterfaceDeclaration(javaGrammarParser.InterfaceDeclarationContext ctx) {
        super.enterInterfaceDeclaration(ctx);
        checkIdentifier("interface", ctx.IDENTIFIER());
    }

    @Override
    public void exitInterfaceDeclaration(javaGrammarParser.InterfaceDeclarationContext ctx) {
        super.exitInterfaceDeclaration(ctx);
    }

    @Override
    public void enterClassBody(javaGrammarParser.ClassBodyContext ctx) {
        super.enterClassBody(ctx);
    }

    @Override
    public void exitClassBody(javaGrammarParser.ClassBodyContext ctx) {
        super.exitClassBody(ctx);
    }

    @Override
    public void enterInterfaceBody(javaGrammarParser.InterfaceBodyContext ctx) {
        super.enterInterfaceBody(ctx);
    }

    @Override
    public void exitInterfaceBody(javaGrammarParser.InterfaceBodyContext ctx) {
        super.exitInterfaceBody(ctx);
    }

    @Override
    public void enterClassBodyDeclaration(javaGrammarParser.ClassBodyDeclarationContext ctx) {
        super.enterClassBodyDeclaration(ctx);
    }

    @Override
    public void exitClassBodyDeclaration(javaGrammarParser.ClassBodyDeclarationContext ctx) {
        super.exitClassBodyDeclaration(ctx);
    }

    @Override
    public void enterMemberDeclaration(javaGrammarParser.MemberDeclarationContext ctx) {
        super.enterMemberDeclaration(ctx);
    }

    @Override
    public void exitMemberDeclaration(javaGrammarParser.MemberDeclarationContext ctx) {
        super.exitMemberDeclaration(ctx);
    }

    @Override
    public void enterMethodDeclaration(javaGrammarParser.MethodDeclarationContext ctx) {
        super.enterMethodDeclaration(ctx);
        checkIdentifier("method", ctx.IDENTIFIER());
    }

    @Override
    public void exitMethodDeclaration(javaGrammarParser.MethodDeclarationContext ctx) {
        super.exitMethodDeclaration(ctx);
    }

    @Override
    public void enterMethodBody(javaGrammarParser.MethodBodyContext ctx) {
        super.enterMethodBody(ctx);
    }

    @Override
    public void exitMethodBody(javaGrammarParser.MethodBodyContext ctx) {
        super.exitMethodBody(ctx);
    }

    @Override
    public void enterTypeTypeOrVoid(javaGrammarParser.TypeTypeOrVoidContext ctx) {
        super.enterTypeTypeOrVoid(ctx);
    }

    @Override
    public void exitTypeTypeOrVoid(javaGrammarParser.TypeTypeOrVoidContext ctx) {
        super.exitTypeTypeOrVoid(ctx);
    }

    @Override
    public void enterGenericMethodDeclaration(javaGrammarParser.GenericMethodDeclarationContext ctx) {
        super.enterGenericMethodDeclaration(ctx);
    }

    @Override
    public void exitGenericMethodDeclaration(javaGrammarParser.GenericMethodDeclarationContext ctx) {
        super.exitGenericMethodDeclaration(ctx);
    }

    @Override
    public void enterGenericConstructorDeclaration(javaGrammarParser.GenericConstructorDeclarationContext ctx) {
        super.enterGenericConstructorDeclaration(ctx);
    }

    @Override
    public void exitGenericConstructorDeclaration(javaGrammarParser.GenericConstructorDeclarationContext ctx) {
        super.exitGenericConstructorDeclaration(ctx);
    }

    @Override
    public void enterConstructorDeclaration(javaGrammarParser.ConstructorDeclarationContext ctx) {
        super.enterConstructorDeclaration(ctx);
    }

    @Override
    public void exitConstructorDeclaration(javaGrammarParser.ConstructorDeclarationContext ctx) {
        super.exitConstructorDeclaration(ctx);
    }

    @Override
    public void enterFieldDeclaration(javaGrammarParser.FieldDeclarationContext ctx) {
        super.enterFieldDeclaration(ctx);
    }

    @Override
    public void exitFieldDeclaration(javaGrammarParser.FieldDeclarationContext ctx) {
        super.exitFieldDeclaration(ctx);
    }

    @Override
    public void enterInterfaceBodyDeclaration(javaGrammarParser.InterfaceBodyDeclarationContext ctx) {
        super.enterInterfaceBodyDeclaration(ctx);
    }

    @Override
    public void exitInterfaceBodyDeclaration(javaGrammarParser.InterfaceBodyDeclarationContext ctx) {
        super.exitInterfaceBodyDeclaration(ctx);
    }

    @Override
    public void enterInterfaceMemberDeclaration(javaGrammarParser.InterfaceMemberDeclarationContext ctx) {
        super.enterInterfaceMemberDeclaration(ctx);
    }

    @Override
    public void exitInterfaceMemberDeclaration(javaGrammarParser.InterfaceMemberDeclarationContext ctx) {
        super.exitInterfaceMemberDeclaration(ctx);
    }

    @Override
    public void enterConstDeclaration(javaGrammarParser.ConstDeclarationContext ctx) {
        super.enterConstDeclaration(ctx);
    }

    @Override
    public void exitConstDeclaration(javaGrammarParser.ConstDeclarationContext ctx) {
        super.exitConstDeclaration(ctx);
    }

    @Override
    public void enterConstantDeclarator(javaGrammarParser.ConstantDeclaratorContext ctx) {
        super.enterConstantDeclarator(ctx);
    }

    @Override
    public void exitConstantDeclarator(javaGrammarParser.ConstantDeclaratorContext ctx) {
        super.exitConstantDeclarator(ctx);
    }

    @Override
    public void enterInterfaceMethodDeclaration(javaGrammarParser.InterfaceMethodDeclarationContext ctx) {
        super.enterInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void exitInterfaceMethodDeclaration(javaGrammarParser.InterfaceMethodDeclarationContext ctx) {
        super.exitInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void enterInterfaceMethodModifier(javaGrammarParser.InterfaceMethodModifierContext ctx) {
        super.enterInterfaceMethodModifier(ctx);
    }

    @Override
    public void exitInterfaceMethodModifier(javaGrammarParser.InterfaceMethodModifierContext ctx) {
        super.exitInterfaceMethodModifier(ctx);
    }

    @Override
    public void enterGenericInterfaceMethodDeclaration(javaGrammarParser.GenericInterfaceMethodDeclarationContext ctx) {
        super.enterGenericInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void exitGenericInterfaceMethodDeclaration(javaGrammarParser.GenericInterfaceMethodDeclarationContext ctx) {
        super.exitGenericInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void enterVariableDeclarators(javaGrammarParser.VariableDeclaratorsContext ctx) {
        super.enterVariableDeclarators(ctx);
    }

    @Override
    public void exitVariableDeclarators(javaGrammarParser.VariableDeclaratorsContext ctx) {
        super.exitVariableDeclarators(ctx);
    }

    @Override
    public void enterVariableDeclarator(javaGrammarParser.VariableDeclaratorContext ctx) {
        super.enterVariableDeclarator(ctx);
    }

    @Override
    public void exitVariableDeclarator(javaGrammarParser.VariableDeclaratorContext ctx) {
        super.exitVariableDeclarator(ctx);
    }

    @Override
    public void enterVariableDeclaratorId(javaGrammarParser.VariableDeclaratorIdContext ctx) {
        super.enterVariableDeclaratorId(ctx);
        checkIdentifier("variable", ctx.IDENTIFIER());
    }

    @Override
    public void exitVariableDeclaratorId(javaGrammarParser.VariableDeclaratorIdContext ctx) {
        super.exitVariableDeclaratorId(ctx);
    }

    @Override
    public void enterVariableInitializer(javaGrammarParser.VariableInitializerContext ctx) {
        super.enterVariableInitializer(ctx);
    }

    @Override
    public void exitVariableInitializer(javaGrammarParser.VariableInitializerContext ctx) {
        super.exitVariableInitializer(ctx);
    }

    @Override
    public void enterArrayInitializer(javaGrammarParser.ArrayInitializerContext ctx) {
        super.enterArrayInitializer(ctx);
    }

    @Override
    public void exitArrayInitializer(javaGrammarParser.ArrayInitializerContext ctx) {
        super.exitArrayInitializer(ctx);
    }

    @Override
    public void enterClassOrInterfaceType(javaGrammarParser.ClassOrInterfaceTypeContext ctx) {
        super.enterClassOrInterfaceType(ctx);
    }

    @Override
    public void exitClassOrInterfaceType(javaGrammarParser.ClassOrInterfaceTypeContext ctx) {
        super.exitClassOrInterfaceType(ctx);
    }

    @Override
    public void enterTypeArgument(javaGrammarParser.TypeArgumentContext ctx) {
        super.enterTypeArgument(ctx);
    }

    @Override
    public void exitTypeArgument(javaGrammarParser.TypeArgumentContext ctx) {
        super.exitTypeArgument(ctx);
    }

    @Override
    public void enterQualifiedNameList(javaGrammarParser.QualifiedNameListContext ctx) {
        super.enterQualifiedNameList(ctx);
    }

    @Override
    public void exitQualifiedNameList(javaGrammarParser.QualifiedNameListContext ctx) {
        super.exitQualifiedNameList(ctx);
    }

    @Override
    public void enterFormalParameters(javaGrammarParser.FormalParametersContext ctx) {
        super.enterFormalParameters(ctx);
    }

    @Override
    public void exitFormalParameters(javaGrammarParser.FormalParametersContext ctx) {
        super.exitFormalParameters(ctx);
    }

    @Override
    public void enterFormalParameterList(javaGrammarParser.FormalParameterListContext ctx) {
        super.enterFormalParameterList(ctx);
    }

    @Override
    public void exitFormalParameterList(javaGrammarParser.FormalParameterListContext ctx) {
        super.exitFormalParameterList(ctx);
    }

    @Override
    public void enterFormalParameter(javaGrammarParser.FormalParameterContext ctx) {
        super.enterFormalParameter(ctx);
    }

    @Override
    public void exitFormalParameter(javaGrammarParser.FormalParameterContext ctx) {
        super.exitFormalParameter(ctx);
    }

    @Override
    public void enterLastFormalParameter(javaGrammarParser.LastFormalParameterContext ctx) {
        super.enterLastFormalParameter(ctx);
    }

    @Override
    public void exitLastFormalParameter(javaGrammarParser.LastFormalParameterContext ctx) {
        super.exitLastFormalParameter(ctx);
    }

    @Override
    public void enterQualifiedName(javaGrammarParser.QualifiedNameContext ctx) {
        super.enterQualifiedName(ctx);
    }

    @Override
    public void exitQualifiedName(javaGrammarParser.QualifiedNameContext ctx) {
        super.exitQualifiedName(ctx);
    }

    @Override
    public void enterLiteral(javaGrammarParser.LiteralContext ctx) {
        super.enterLiteral(ctx);
    }

    @Override
    public void exitLiteral(javaGrammarParser.LiteralContext ctx) {
        super.exitLiteral(ctx);
    }

    @Override
    public void enterIntegerLiteral(javaGrammarParser.IntegerLiteralContext ctx) {
        super.enterIntegerLiteral(ctx);
    }

    @Override
    public void exitIntegerLiteral(javaGrammarParser.IntegerLiteralContext ctx) {
        super.exitIntegerLiteral(ctx);
    }

    @Override
    public void enterFloatLiteral(javaGrammarParser.FloatLiteralContext ctx) {
        super.enterFloatLiteral(ctx);
    }

    @Override
    public void exitFloatLiteral(javaGrammarParser.FloatLiteralContext ctx) {
        super.exitFloatLiteral(ctx);
    }

    @Override
    public void enterAltAnnotationQualifiedName(javaGrammarParser.AltAnnotationQualifiedNameContext ctx) {
        super.enterAltAnnotationQualifiedName(ctx);
    }

    @Override
    public void exitAltAnnotationQualifiedName(javaGrammarParser.AltAnnotationQualifiedNameContext ctx) {
        super.exitAltAnnotationQualifiedName(ctx);
    }

    @Override
    public void enterAnnotation(javaGrammarParser.AnnotationContext ctx) {
        super.enterAnnotation(ctx);
    }

    @Override
    public void exitAnnotation(javaGrammarParser.AnnotationContext ctx) {
        super.exitAnnotation(ctx);
    }

    @Override
    public void enterElementValuePairs(javaGrammarParser.ElementValuePairsContext ctx) {
        super.enterElementValuePairs(ctx);
    }

    @Override
    public void exitElementValuePairs(javaGrammarParser.ElementValuePairsContext ctx) {
        super.exitElementValuePairs(ctx);
    }

    @Override
    public void enterElementValuePair(javaGrammarParser.ElementValuePairContext ctx) {
        super.enterElementValuePair(ctx);
    }

    @Override
    public void exitElementValuePair(javaGrammarParser.ElementValuePairContext ctx) {
        super.exitElementValuePair(ctx);
    }

    @Override
    public void enterElementValue(javaGrammarParser.ElementValueContext ctx) {
        super.enterElementValue(ctx);
    }

    @Override
    public void exitElementValue(javaGrammarParser.ElementValueContext ctx) {
        super.exitElementValue(ctx);
    }

    @Override
    public void enterElementValueArrayInitializer(javaGrammarParser.ElementValueArrayInitializerContext ctx) {
        super.enterElementValueArrayInitializer(ctx);
    }

    @Override
    public void exitElementValueArrayInitializer(javaGrammarParser.ElementValueArrayInitializerContext ctx) {
        super.exitElementValueArrayInitializer(ctx);
    }

    @Override
    public void enterAnnotationTypeDeclaration(javaGrammarParser.AnnotationTypeDeclarationContext ctx) {
        super.enterAnnotationTypeDeclaration(ctx);
        checkIdentifier("annotation", ctx.IDENTIFIER());
    }

    @Override
    public void exitAnnotationTypeDeclaration(javaGrammarParser.AnnotationTypeDeclarationContext ctx) {
        super.exitAnnotationTypeDeclaration(ctx);
    }

    @Override
    public void enterAnnotationTypeBody(javaGrammarParser.AnnotationTypeBodyContext ctx) {
        super.enterAnnotationTypeBody(ctx);
    }

    @Override
    public void exitAnnotationTypeBody(javaGrammarParser.AnnotationTypeBodyContext ctx) {
        super.exitAnnotationTypeBody(ctx);
    }

    @Override
    public void enterAnnotationTypeElementDeclaration(javaGrammarParser.AnnotationTypeElementDeclarationContext ctx) {
        super.enterAnnotationTypeElementDeclaration(ctx);
    }

    @Override
    public void exitAnnotationTypeElementDeclaration(javaGrammarParser.AnnotationTypeElementDeclarationContext ctx) {
        super.exitAnnotationTypeElementDeclaration(ctx);
    }

    @Override
    public void enterAnnotationTypeElementRest(javaGrammarParser.AnnotationTypeElementRestContext ctx) {
        super.enterAnnotationTypeElementRest(ctx);
    }

    @Override
    public void exitAnnotationTypeElementRest(javaGrammarParser.AnnotationTypeElementRestContext ctx) {
        super.exitAnnotationTypeElementRest(ctx);
    }

    @Override
    public void enterAnnotationMethodOrConstantRest(javaGrammarParser.AnnotationMethodOrConstantRestContext ctx) {
        super.enterAnnotationMethodOrConstantRest(ctx);
    }

    @Override
    public void exitAnnotationMethodOrConstantRest(javaGrammarParser.AnnotationMethodOrConstantRestContext ctx) {
        super.exitAnnotationMethodOrConstantRest(ctx);
    }

    @Override
    public void enterAnnotationMethodRest(javaGrammarParser.AnnotationMethodRestContext ctx) {
        super.enterAnnotationMethodRest(ctx);
    }

    @Override
    public void exitAnnotationMethodRest(javaGrammarParser.AnnotationMethodRestContext ctx) {
        super.exitAnnotationMethodRest(ctx);
    }

    @Override
    public void enterAnnotationConstantRest(javaGrammarParser.AnnotationConstantRestContext ctx) {
        super.enterAnnotationConstantRest(ctx);
    }

    @Override
    public void exitAnnotationConstantRest(javaGrammarParser.AnnotationConstantRestContext ctx) {
        super.exitAnnotationConstantRest(ctx);
    }

    @Override
    public void enterDefaultValue(javaGrammarParser.DefaultValueContext ctx) {
        super.enterDefaultValue(ctx);
    }

    @Override
    public void exitDefaultValue(javaGrammarParser.DefaultValueContext ctx) {
        super.exitDefaultValue(ctx);
    }

    @Override
    public void enterBlock(javaGrammarParser.BlockContext ctx) {
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(javaGrammarParser.BlockContext ctx) {
        super.exitBlock(ctx);
    }

    @Override
    public void enterBlockStatement(javaGrammarParser.BlockStatementContext ctx) {
        super.enterBlockStatement(ctx);
    }

    @Override
    public void exitBlockStatement(javaGrammarParser.BlockStatementContext ctx) {
        super.exitBlockStatement(ctx);
    }

    @Override
    public void enterLocalVariableDeclaration(javaGrammarParser.LocalVariableDeclarationContext ctx) {
        super.enterLocalVariableDeclaration(ctx);
    }

    @Override
    public void exitLocalVariableDeclaration(javaGrammarParser.LocalVariableDeclarationContext ctx) {
        super.exitLocalVariableDeclaration(ctx);
    }

    @Override
    public void enterLocalTypeDeclaration(javaGrammarParser.LocalTypeDeclarationContext ctx) {
        super.enterLocalTypeDeclaration(ctx);
    }

    @Override
    public void exitLocalTypeDeclaration(javaGrammarParser.LocalTypeDeclarationContext ctx) {
        super.exitLocalTypeDeclaration(ctx);
    }

    @Override
    public void enterStatement(javaGrammarParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(javaGrammarParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterCatchClause(javaGrammarParser.CatchClauseContext ctx) {
        super.enterCatchClause(ctx);
    }

    @Override
    public void exitCatchClause(javaGrammarParser.CatchClauseContext ctx) {
        super.exitCatchClause(ctx);
    }

    @Override
    public void enterCatchType(javaGrammarParser.CatchTypeContext ctx) {
        super.enterCatchType(ctx);
    }

    @Override
    public void exitCatchType(javaGrammarParser.CatchTypeContext ctx) {
        super.exitCatchType(ctx);
    }

    @Override
    public void enterFinallyBlock(javaGrammarParser.FinallyBlockContext ctx) {
        super.enterFinallyBlock(ctx);
    }

    @Override
    public void exitFinallyBlock(javaGrammarParser.FinallyBlockContext ctx) {
        super.exitFinallyBlock(ctx);
    }

    @Override
    public void enterResourceSpecification(javaGrammarParser.ResourceSpecificationContext ctx) {
        super.enterResourceSpecification(ctx);
    }

    @Override
    public void exitResourceSpecification(javaGrammarParser.ResourceSpecificationContext ctx) {
        super.exitResourceSpecification(ctx);
    }

    @Override
    public void enterResources(javaGrammarParser.ResourcesContext ctx) {
        super.enterResources(ctx);
    }

    @Override
    public void exitResources(javaGrammarParser.ResourcesContext ctx) {
        super.exitResources(ctx);
    }

    @Override
    public void enterResource(javaGrammarParser.ResourceContext ctx) {
        super.enterResource(ctx);
    }

    @Override
    public void exitResource(javaGrammarParser.ResourceContext ctx) {
        super.exitResource(ctx);
    }

    @Override
    public void enterSwitchBlockStatementGroup(javaGrammarParser.SwitchBlockStatementGroupContext ctx) {
        super.enterSwitchBlockStatementGroup(ctx);
    }

    @Override
    public void exitSwitchBlockStatementGroup(javaGrammarParser.SwitchBlockStatementGroupContext ctx) {
        super.exitSwitchBlockStatementGroup(ctx);
    }

    @Override
    public void enterSwitchLabel(javaGrammarParser.SwitchLabelContext ctx) {
        super.enterSwitchLabel(ctx);
    }

    @Override
    public void exitSwitchLabel(javaGrammarParser.SwitchLabelContext ctx) {
        super.exitSwitchLabel(ctx);
    }

    @Override
    public void enterForControl(javaGrammarParser.ForControlContext ctx) {
        super.enterForControl(ctx);
    }

    @Override
    public void exitForControl(javaGrammarParser.ForControlContext ctx) {
        super.exitForControl(ctx);
    }

    @Override
    public void enterForInit(javaGrammarParser.ForInitContext ctx) {
        super.enterForInit(ctx);
    }

    @Override
    public void exitForInit(javaGrammarParser.ForInitContext ctx) {
        super.exitForInit(ctx);
    }

    @Override
    public void enterEnhancedForControl(javaGrammarParser.EnhancedForControlContext ctx) {
        super.enterEnhancedForControl(ctx);
    }

    @Override
    public void exitEnhancedForControl(javaGrammarParser.EnhancedForControlContext ctx) {
        super.exitEnhancedForControl(ctx);
    }

    @Override
    public void enterParExpression(javaGrammarParser.ParExpressionContext ctx) {
        super.enterParExpression(ctx);
    }

    @Override
    public void exitParExpression(javaGrammarParser.ParExpressionContext ctx) {
        super.exitParExpression(ctx);
    }

    @Override
    public void enterExpressionList(javaGrammarParser.ExpressionListContext ctx) {
        super.enterExpressionList(ctx);
    }

    @Override
    public void exitExpressionList(javaGrammarParser.ExpressionListContext ctx) {
        super.exitExpressionList(ctx);
    }

    @Override
    public void enterMethodCall(javaGrammarParser.MethodCallContext ctx) {
        super.enterMethodCall(ctx);
    }

    @Override
    public void exitMethodCall(javaGrammarParser.MethodCallContext ctx) {
        super.exitMethodCall(ctx);
    }

    @Override
    public void enterExpression(javaGrammarParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(javaGrammarParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterLambdaExpression(javaGrammarParser.LambdaExpressionContext ctx) {
        super.enterLambdaExpression(ctx);
    }

    @Override
    public void exitLambdaExpression(javaGrammarParser.LambdaExpressionContext ctx) {
        super.exitLambdaExpression(ctx);
    }

    @Override
    public void enterLambdaParameters(javaGrammarParser.LambdaParametersContext ctx) {
        super.enterLambdaParameters(ctx);
    }

    @Override
    public void exitLambdaParameters(javaGrammarParser.LambdaParametersContext ctx) {
        super.exitLambdaParameters(ctx);
    }

    @Override
    public void enterLambdaBody(javaGrammarParser.LambdaBodyContext ctx) {
        super.enterLambdaBody(ctx);
    }

    @Override
    public void exitLambdaBody(javaGrammarParser.LambdaBodyContext ctx) {
        super.exitLambdaBody(ctx);
    }

    @Override
    public void enterPrimary(javaGrammarParser.PrimaryContext ctx) {
        super.enterPrimary(ctx);
    }

    @Override
    public void exitPrimary(javaGrammarParser.PrimaryContext ctx) {
        super.exitPrimary(ctx);
    }

    @Override
    public void enterClassType(javaGrammarParser.ClassTypeContext ctx) {
        super.enterClassType(ctx);
    }

    @Override
    public void exitClassType(javaGrammarParser.ClassTypeContext ctx) {
        super.exitClassType(ctx);
    }

    @Override
    public void enterCreator(javaGrammarParser.CreatorContext ctx) {
        super.enterCreator(ctx);
    }

    @Override
    public void exitCreator(javaGrammarParser.CreatorContext ctx) {
        super.exitCreator(ctx);
    }

    @Override
    public void enterCreatedName(javaGrammarParser.CreatedNameContext ctx) {
        super.enterCreatedName(ctx);
    }

    @Override
    public void exitCreatedName(javaGrammarParser.CreatedNameContext ctx) {
        super.exitCreatedName(ctx);
    }

    @Override
    public void enterInnerCreator(javaGrammarParser.InnerCreatorContext ctx) {
        super.enterInnerCreator(ctx);
    }

    @Override
    public void exitInnerCreator(javaGrammarParser.InnerCreatorContext ctx) {
        super.exitInnerCreator(ctx);
    }

    @Override
    public void enterArrayCreatorRest(javaGrammarParser.ArrayCreatorRestContext ctx) {
        super.enterArrayCreatorRest(ctx);
    }

    @Override
    public void exitArrayCreatorRest(javaGrammarParser.ArrayCreatorRestContext ctx) {
        super.exitArrayCreatorRest(ctx);
    }

    @Override
    public void enterClassCreatorRest(javaGrammarParser.ClassCreatorRestContext ctx) {
        super.enterClassCreatorRest(ctx);
    }

    @Override
    public void exitClassCreatorRest(javaGrammarParser.ClassCreatorRestContext ctx) {
        super.exitClassCreatorRest(ctx);
    }

    @Override
    public void enterExplicitGenericInvocation(javaGrammarParser.ExplicitGenericInvocationContext ctx) {
        super.enterExplicitGenericInvocation(ctx);
    }

    @Override
    public void exitExplicitGenericInvocation(javaGrammarParser.ExplicitGenericInvocationContext ctx) {
        super.exitExplicitGenericInvocation(ctx);
    }

    @Override
    public void enterTypeArgumentsOrDiamond(javaGrammarParser.TypeArgumentsOrDiamondContext ctx) {
        super.enterTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public void exitTypeArgumentsOrDiamond(javaGrammarParser.TypeArgumentsOrDiamondContext ctx) {
        super.exitTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public void enterNonWildcardTypeArgumentsOrDiamond(javaGrammarParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        super.enterNonWildcardTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public void exitNonWildcardTypeArgumentsOrDiamond(javaGrammarParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        super.exitNonWildcardTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public void enterNonWildcardTypeArguments(javaGrammarParser.NonWildcardTypeArgumentsContext ctx) {
        super.enterNonWildcardTypeArguments(ctx);
    }

    @Override
    public void exitNonWildcardTypeArguments(javaGrammarParser.NonWildcardTypeArgumentsContext ctx) {
        super.exitNonWildcardTypeArguments(ctx);
    }

    @Override
    public void enterTypeList(javaGrammarParser.TypeListContext ctx) {
        super.enterTypeList(ctx);
    }

    @Override
    public void exitTypeList(javaGrammarParser.TypeListContext ctx) {
        super.exitTypeList(ctx);
    }

    @Override
    public void enterTypeType(javaGrammarParser.TypeTypeContext ctx) {
        super.enterTypeType(ctx);
    }

    @Override
    public void exitTypeType(javaGrammarParser.TypeTypeContext ctx) {
        super.exitTypeType(ctx);
    }

    @Override
    public void enterPrimitiveType(javaGrammarParser.PrimitiveTypeContext ctx) {
        super.enterPrimitiveType(ctx);
    }

    @Override
    public void exitPrimitiveType(javaGrammarParser.PrimitiveTypeContext ctx) {
        super.exitPrimitiveType(ctx);
    }

    @Override
    public void enterTypeArguments(javaGrammarParser.TypeArgumentsContext ctx) {
        super.enterTypeArguments(ctx);
    }

    @Override
    public void exitTypeArguments(javaGrammarParser.TypeArgumentsContext ctx) {
        super.exitTypeArguments(ctx);
    }

    @Override
    public void enterSuperSuffix(javaGrammarParser.SuperSuffixContext ctx) {
        super.enterSuperSuffix(ctx);
    }

    @Override
    public void exitSuperSuffix(javaGrammarParser.SuperSuffixContext ctx) {
        super.exitSuperSuffix(ctx);
    }

    @Override
    public void enterExplicitGenericInvocationSuffix(javaGrammarParser.ExplicitGenericInvocationSuffixContext ctx) {
        super.enterExplicitGenericInvocationSuffix(ctx);
    }

    @Override
    public void exitExplicitGenericInvocationSuffix(javaGrammarParser.ExplicitGenericInvocationSuffixContext ctx) {
        super.exitExplicitGenericInvocationSuffix(ctx);
    }

    @Override
    public void enterArguments(javaGrammarParser.ArgumentsContext ctx) {
        super.enterArguments(ctx);
    }

    @Override
    public void exitArguments(javaGrammarParser.ArgumentsContext ctx) {
        super.exitArguments(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
