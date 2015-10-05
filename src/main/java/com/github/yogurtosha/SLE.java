package com.github.yogurtosha;

/**
 * Система линейных уравнений
 */
public class SLE {

    private Object[][] sleMatrix;

    public SLE(Object[][] sle){
        //  в будущем сделать проверки
        this.sleMatrix = sle;
    }

    /**
     * Парсинг строки с линейными уравнениеми и перевода в нужный вид
     * example:
     * "x-y=-5;2x+y=-7"
     * should be
     * 1 -1 -5
     * 2  1 -7
     * @param sle - система линейных в виде строки;
     */
    protected void parseSle(String sle){

    }

    public Integer getColumns(){
        return this.sleMatrix[0].length;
    }

    public Integer getRows(){
        return this.sleMatrix.length;
    }

}
