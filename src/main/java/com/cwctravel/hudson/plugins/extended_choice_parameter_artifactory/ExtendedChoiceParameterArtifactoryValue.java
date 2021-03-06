/*
 *Copyright (c) 2013 Costco, Vimil Saju
 *See the file license.txt for copying permission.
 */


package com.cwctravel.hudson.plugins.extended_choice_parameter_artifactory;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.model.StringParameterValue;

public class ExtendedChoiceParameterArtifactoryValue extends StringParameterValue{
	private static final long serialVersionUID = 7993744779892775177L;
	
	@DataBoundConstructor
	public ExtendedChoiceParameterArtifactoryValue(String name, String value) {
		super(name, value);
	}

}
