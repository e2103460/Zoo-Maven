package com.ensim.info.TP1.exception;

public class LimiteVisiteurException extends Exception{
    public LimiteVisiteurException()
    {
        System.out.println("Trop de visiteurs dans ce secteur");
    }
}
