// Generated from C:/Users/daniela/Documents/Universidad/Semestre 8/Lenguajes/Final proyect/styleAnalizer/src/main/java/com/finalProject/styleAnalizer/grammar\javaGrammar.g4 by ANTLR 4.8
package com.finalProject.styleAnalizer.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javaGrammarParser}.
 */
public interface javaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(javaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(javaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(javaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(javaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(javaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(javaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(javaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(javaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(javaGrammarParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(javaGrammarParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(javaGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(javaGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(javaGrammarParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(javaGrammarParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(javaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(javaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(javaGrammarParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(javaGrammarParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(javaGrammarParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(javaGrammarParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(javaGrammarParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(javaGrammarParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(javaGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(javaGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(javaGrammarParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(javaGrammarParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(javaGrammarParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(javaGrammarParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(javaGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(javaGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(javaGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(javaGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(javaGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(javaGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(javaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(javaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(javaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(javaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(javaGrammarParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(javaGrammarParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(javaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(javaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(javaGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(javaGrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(javaGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(javaGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(javaGrammarParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(javaGrammarParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(javaGrammarParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(javaGrammarParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(javaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(javaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(javaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(javaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(javaGrammarParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(javaGrammarParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(javaGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(javaGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(javaGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(javaGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(javaGrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(javaGrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(javaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(javaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(javaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(javaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(javaGrammarParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(javaGrammarParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(javaGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(javaGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(javaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(javaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(javaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(javaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(javaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(javaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(javaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(javaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(javaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(javaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(javaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(javaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(javaGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(javaGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(javaGrammarParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(javaGrammarParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(javaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(javaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(javaGrammarParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(javaGrammarParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(javaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(javaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(javaGrammarParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(javaGrammarParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(javaGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(javaGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(javaGrammarParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(javaGrammarParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(javaGrammarParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(javaGrammarParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(javaGrammarParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(javaGrammarParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(javaGrammarParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(javaGrammarParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(javaGrammarParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(javaGrammarParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(javaGrammarParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(javaGrammarParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(javaGrammarParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(javaGrammarParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(javaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(javaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(javaGrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(javaGrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(javaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(javaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(javaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(javaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(javaGrammarParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(javaGrammarParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(javaGrammarParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(javaGrammarParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(javaGrammarParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(javaGrammarParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(javaGrammarParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(javaGrammarParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(javaGrammarParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(javaGrammarParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(javaGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(javaGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(javaGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(javaGrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(javaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(javaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(javaGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(javaGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(javaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(javaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(javaGrammarParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(javaGrammarParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(javaGrammarParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(javaGrammarParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(javaGrammarParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(javaGrammarParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(javaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(javaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(javaGrammarParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(javaGrammarParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(javaGrammarParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(javaGrammarParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(javaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(javaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(javaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(javaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(javaGrammarParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(javaGrammarParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(javaGrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(javaGrammarParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(javaGrammarParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(javaGrammarParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(javaGrammarParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(javaGrammarParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(javaGrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(javaGrammarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(javaGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(javaGrammarParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(javaGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(javaGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(javaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(javaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(javaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(javaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(javaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(javaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(javaGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(javaGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(javaGrammarParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(javaGrammarParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(javaGrammarParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(javaGrammarParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(javaGrammarParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(javaGrammarParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(javaGrammarParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(javaGrammarParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(javaGrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(javaGrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(javaGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(javaGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(javaGrammarParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(javaGrammarParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(javaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(javaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(javaGrammarParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(javaGrammarParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(javaGrammarParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(javaGrammarParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(javaGrammarParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(javaGrammarParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(javaGrammarParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(javaGrammarParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(javaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(javaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(javaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(javaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(javaGrammarParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(javaGrammarParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(javaGrammarParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(javaGrammarParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(javaGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(javaGrammarParser.ArgumentsContext ctx);
}