package com.jmasters.demo.model.Depot;


import com.jmasters.demo.model.Evaluation.Cun;
import com.jmasters.demo.model.Users.Validateur;



import java.util.ArrayList;
import java.util.Date;

/**
 * @author cfsc
 * @version 1.0
 * @created 07-mars-2018 14:29:01
 */

public class Dossier {

	private int id;
	private Date date;
	private ArrayList<Information> informations;
	private Cun cun ;
	private Validateur validateur;

}