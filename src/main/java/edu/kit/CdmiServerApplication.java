/**   Copyright 2015 Karlsruhe Institute of Technology (KIT)

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0
 **/
package edu.kit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snia.cdmiserver.dao.CapabilityDao;
import org.snia.cdmiserver.dao.ContainerDao;
import org.snia.cdmiserver.dao.DataObjectDao;
import org.snia.cdmiserver.dao.filesystem.CapabilityDaoImpl;
import org.snia.cdmiserver.dao.filesystem.ContainerDaoImpl;
import org.snia.cdmiserver.dao.filesystem.DataObjectDaoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CdmiServerApplication {

	private static final Logger log = LoggerFactory
			.getLogger(CdmiServerApplication.class);

	@Bean
	@Value("${cdmi.localdir}")
	ContainerDao containerDao(String baseDirectoryName) {
		return new ContainerDaoImpl().setBaseDirectoryName(baseDirectoryName);
	}

	@Bean
	CapabilityDao capabilityDao() {
		return new CapabilityDaoImpl();
	}

	@Bean
	@Value("${cdmi.localdir}")
	DataObjectDao dataObjectDao(String baseDirectoryName) {
		return new DataObjectDaoImpl().setBaseDirectoryName(baseDirectoryName);
	}

	public static void main(String[] args) {
		SpringApplication.run(CdmiServerApplication.class, args);
	}
}
