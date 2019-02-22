package com.yk.generator;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;

import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 * .
 * <p/>
 *
 * @author yangk
 * @version 1.0.0
 * @since 2019-02-22
 *
 * 自定义Generator注释
 */
public class MyCommentGenerator implements CommentGenerator {

    /** The properties. */
    private Properties properties;

    /** The suppress date. */
    private boolean suppressDate;

    /** The suppress all comments. */
    private boolean suppressAllComments;

    /** The addition of table remark's comments.
     * If suppressAllComments is true, this option is ignored*/
    private boolean addRemarkComments;

    private SimpleDateFormat dateFormat;

    /**
     * Instantiates a new default comment generator.
     */
    public MyCommentGenerator() {
        super();
        properties = new Properties();
        suppressDate = false;
        suppressAllComments = false;
        addRemarkComments = false;
        dateFormat = new SimpleDateFormat("yyyy-mm-dd");
    }

    @Override
    public void addConfigurationProperties(Properties properties) {

    }

    /**
     * 为实体类属性添加数据库字段注释
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
    }

    /**
     * 为Example类中的属性添加注释
     * @param field
     * @param introspectedTable
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

        if (suppressAllComments) {
            return;
        }
        field.addJavaDocLine("/**");

        addJavadocTag(field);

        field.addJavaDocLine(" */");
    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }

        topLevelClass.addJavaDocLine("/**");

        StringBuilder sb = new StringBuilder();
        String remarks = introspectedTable.getRemarks();
        System.out.println("remarks:" + introspectedTable.toString());
        sb.append(" * ");
        sb.append(remarks);
        sb.append(" ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        topLevelClass.addJavaDocLine(sb.toString().replace("\n", " "));

        topLevelClass.addJavaDocLine(" */");
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {

    }

    @Override
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {

    }

    /**
     *
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     * get方法不需要注释
     */
    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    /**
     *
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     * set方法不需要注释
     */
    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    /**
     *
     * @param method
     * @param introspectedTable
     * 普通方法注释
     */
    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }

        method.addJavaDocLine("/**");
        addJavadocTag(method);
        method.addJavaDocLine(" */");
    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {

    }

    /**
     * mapper配置文件注释
     * @param xmlElement
     */
    @Override
    public void addComment(XmlElement xmlElement) {
        if (suppressAllComments) {
            return;
        }

        xmlElement.addElement(new TextElement("<!--"));
        addXmldocTag(xmlElement);
        xmlElement.addElement(new TextElement("-->"));
    }

    @Override
    public void addRootComment(XmlElement rootElement) {

    }

    protected void addJavadocTag(JavaElement javaElement){
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        javaElement.addJavaDocLine(sb.toString());
    }

    protected void addXmldocTag(XmlElement xmlElement){
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        xmlElement.addElement(new TextElement(sb.toString()));
    }
}
