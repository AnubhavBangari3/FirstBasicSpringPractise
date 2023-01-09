
package com.example.hello;
import com.example.hello.Address;
import com.example.hello.AppSpringConfiguration;
import com.example.hello.Person;
import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppSpringConfigHello {
    public static void main(String[] args){
          //1) Launch a Spring Context
        try(
                 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppSpringConfiguration.class);
            )
        {
        
         //2) Configure the things that we want Sping to manage in - @ Configuration
         //Using @Bean in AppStringConfiguration.java
         
         //3) Retrieving 
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        
        Person p=context.getBean("person",Person.class);
        System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress().getFirst()+" "+p.getAddress().getCity());
        //Calling the adddress bean by changing the name=address2
        Address a=context.getBean("address2",Address.class);
        System.out.println(a.getFirst()+" "+a.getCity());
        
        //Calling the bean by method
        Person pa=context.getBean("person2methodCall",Person.class);
        System.out.println(pa.getName()+" "+pa.getAge()+" "+pa.getAddress()+" "+pa.getAddress().getFirst()+" "+pa.getAddress().getCity());
        
        //Calling the bean by attribute
        Person pA=context.getBean("person3callAttribute",Person.class);
        System.out.println(pA.getName() + " " +pA.getAge() + " "+pA.getAddress());}
        
        //TO show list of beans
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
    
}
