package com.jmasters.demo.model.Users;

import com.jmasters.demo.model.Evaluation.Cun;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MembreCun extends Compte{
    private  Boolean chef;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_cun")
    private Cun cun ;

}
