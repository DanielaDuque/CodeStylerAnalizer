// Generated from C:/Users/daniela/Documents/Universidad/Semestre 8/Lenguajes/Final proyect/styleAnalizer/src/main/java/com/finalProject/styleAnalizer/grammar\javaGrammar.g4 by ANTLR 4.8
package com.finalProject.styleAnalizer.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link javaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface javaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(javaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(javaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(javaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(javaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(javaGrammarParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(javaGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(javaGrammarParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(javaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(javaGrammarParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(javaGrammarParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(javaGrammarParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(javaGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(javaGrammarParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(javaGrammarParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(javaGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(javaGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(javaGrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(javaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(javaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(javaGrammarParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(javaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(javaGrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(javaGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(javaGrammarParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(javaGrammarParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(javaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(javaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(javaGrammarParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(javaGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(javaGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(javaGrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(javaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(javaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(javaGrammarParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(javaGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(javaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(javaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(javaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(javaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(javaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(javaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(javaGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(javaGrammarParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(javaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(javaGrammarParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(javaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(javaGrammarParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(javaGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(javaGrammarParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(javaGrammarParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(javaGrammarParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(javaGrammarParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(javaGrammarParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(javaGrammarParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(javaGrammarParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(javaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(javaGrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(javaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(javaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(javaGrammarParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(javaGrammarParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(javaGrammarParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(javaGrammarParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(javaGrammarParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(javaGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(javaGrammarParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(javaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(javaGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(javaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(javaGrammarParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(javaGrammarParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(javaGrammarParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(javaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(javaGrammarParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(javaGrammarParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(javaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(javaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(javaGrammarParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(javaGrammarParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(javaGrammarParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(javaGrammarParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(javaGrammarParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(javaGrammarParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(javaGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(javaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(javaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(javaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(javaGrammarParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(javaGrammarParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(javaGrammarParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(javaGrammarParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(javaGrammarParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(javaGrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(javaGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(javaGrammarParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(javaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(javaGrammarParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(javaGrammarParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(javaGrammarParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(javaGrammarParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(javaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(javaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(javaGrammarParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(javaGrammarParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(javaGrammarParser.ArgumentsContext ctx);
}