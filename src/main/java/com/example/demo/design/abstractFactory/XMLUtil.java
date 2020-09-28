package com.example.demo.design.abstractFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLUtil {
    public static SkinFactory getBean(){
        //获取DocumentBuilder对象工厂
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            //获取DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document;
            //根据xml配置文件生成document对象
            document = builder.parse(new File("src//main//java//com//example//demo//design//abstractFactory//config.xml"));

            NodeList node = document.getElementsByTagName("className");

            Node firstChild = node.item(0).getFirstChild();

            String name = firstChild.getNodeValue();

            //通过类名反射出实体类对象
            Class c = Class.forName(name);

            Object o = c.newInstance();

            return (SkinFactory) o;


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
