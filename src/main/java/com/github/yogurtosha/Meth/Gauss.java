package com.github.yogurtosha.Meth;

import com.github.yogurtosha.SLE;

import java.util.ArrayDeque;
import java.util.List;

/**
 * Метод Гаусса тут
 */
public class Gauss {
    private class Step{
        public String description;
        public SLE sle;
    }

    private ArrayDeque<Step> gSteps;
    private SLE sle;
    private Integer columns,rows;

    public Gauss(SLE sle){
        this.sle = sle;
        this.columns = sle.getColumns();
        this.rows = sle.getRows();
    }

    public void calculate(){
        
    }
}
