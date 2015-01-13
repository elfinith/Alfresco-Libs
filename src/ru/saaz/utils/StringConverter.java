package ru.saaz.utils;

import java.util.*;
import org.alfresco.repo.processor.BaseProcessorExtension;
 
public class StringConverter extends BaseProcessorExtension {
 
	public List<String> convert(String s) {
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
		return list;
	}	
}