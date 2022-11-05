package edu.bsuir.xmlparsing.saxparser;

import edu.bsuir.xmlparsing.entities.Employee;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SAXExample {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static <Employee> void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory factory = SAXParserFactory.newInstance();//синглтон
        SAXParser parser = factory.newSAXParser();//фабрика

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("C:\\IdeaProjects\\LW4SITRA\\src\\edu\\bsuir\\xmlparsing\\saxparser\\forparsing"), handler);

        //здесь вызовем метод для вычисления кол-ва разработчиков каждого уровня

        int count_of_juniors = 0;
        int count_of_middles = 0;
        int count_of_seniors = 0;

        for (edu.bsuir.xmlparsing.entities.Employee employee : employees){
            if (employee.getJob().equals("Junior Software Developer")){
                count_of_juniors++;
            }
            if (employee.getJob().equals("Middle Software Developer")){
                count_of_middles++;
            }
            if (employee.getJob().equals("Senior Software Developer")){
                count_of_seniors++;
            }
        }
        System.out.println("В компании " + count_of_juniors + " младших разработчиков");
        System.out.println("В компании " + count_of_middles + " опытных разработчиков");
        System.out.println("В компании " + count_of_seniors + " старших разработчиков");
    }


    private static class XMLHandler extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("employee")) {
                String name = attributes.getValue("name");
                String job = attributes.getValue("job");
                employees.add(new Employee(name, job));
            }
        }
    }
}

    /*private void analys_of_developers(){
        int count_of_juniors = 0;
        int count_of_middles = 0;
        int count_of_seniors = 0;

        for (edu.bsuir.xmlparsing.entities.Employee employee : employees){
            if (employee.getJob().equals("Junior Software Developer")){
                count_of_juniors++;
            }
            if (employee.getJob().equals("Middle Software Developer")){
                count_of_middles++;
            }
            if (employee.getJob().equals("Senior Software Developer")){
                count_of_seniors++;
            }
        }
        System.out.println("В компании " + count_of_juniors + " младших разработчиков");
        System.out.println("В компании " + count_of_middles + " опытных разработчиков");
        System.out.println("В компании " + count_of_seniors + " старших разработчиков");
    }*/


