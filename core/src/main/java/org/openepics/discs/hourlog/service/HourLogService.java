/*
 * This software is Copyright by the Board of Trustees of Michigan
 *  State University (c) Copyright 2013, 2014.
 *  
 *  You may use this software under the terms of the GNU public license
 *  (GPL). The terms of this license are described at:
 *    http://www.gnu.org/licenses/gpl.txt
 *  
 *  Contact Information:
 *       Facility for Rare Isotope Beam
 *       Michigan State University
 *       East Lansing, MI 48824-1321
 *        http://frib.msu.edu
 */
package org.openepics.discs.hourlog.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * Hour Log RESTful service
 *
 * @author vuppala
 */
@javax.ws.rs.ApplicationPath("/api/rest")
public class HourLogService extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return getRestResourceClasses();
    }

    /**
     * Do not modify this method. It is automatically generated by NetBeans REST
     * support.
     */
    private Set<Class<?>> getRestResourceClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        resources.add(org.openepics.discs.hourlog.service.v0_1_0.EventResource.class);
        resources.add(org.openepics.discs.hourlog.service.v0_1_0.FacilityResource.class);
        resources.add(org.openepics.discs.hourlog.service.v0_1_0.LogEntryResource.class);
        resources.add(org.openepics.discs.hourlog.service.v0_1_0.ReportResource.class);
        resources.add(org.openepics.discs.hourlog.service.v0_1_0.StateResource.class);
        return resources;
    }
}