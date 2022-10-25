package com.net.creations.rules.checker;

import com.net.creations.rules.PubRule;

public class DownTownPub {
private PubRule rule;

public DownTownPub(PubRule rule) {
	super();
	this.rule = rule;
}
public boolean checkRules() {
boolean valid=	this.rule.validProf();
int age=	this.rule.age();
boolean followed=	this.rule.dressCodeFollowed();
	
if(valid || followed || age==21) {
	System.out.println("they are following");
}else {
	System.out.println("they are not following");
}
	return true;
}
}
