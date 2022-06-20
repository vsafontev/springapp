package ru.safontev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic(){

    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("init");

    }

    public void doMyDestroy(){
        System.out.println("destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }


}
