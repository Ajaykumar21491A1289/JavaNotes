package com.raj.struts2;

import java.util.*; 

import com.opensymphony.xwork2.util.ValueStack;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OGNLAction extends ActionSupport{
   private String name;

   public String execute() throws Exception {
      ValueStack stack = ActionContext.getContext().getValueStack();
      Map<String, Object> context = new HashMap<String, Object>();

      context.put("key1", new String("This is key1")); 
      context.put("key2", new String("This is key2"));
      stack.push(context);

      System.out.println("Size of the valueStack: " + stack.size());
      return "success";
   }  

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
