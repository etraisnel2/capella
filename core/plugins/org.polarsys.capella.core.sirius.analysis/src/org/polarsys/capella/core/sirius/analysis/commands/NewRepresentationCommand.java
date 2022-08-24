/*******************************************************************************
 * Copyright (c) 2022 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.sirius.analysis.commands;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.polarsys.capella.common.tools.report.appenders.usage.UsageMonitoringLogger;
import org.polarsys.capella.common.tools.report.appenders.usage.util.UsageMonitoring.EventStatus;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.sirius.analysis.Messages;
import org.polarsys.capella.shared.id.handler.IdManager;

//The command allowing to create a new representation.
public class NewRepresentationCommand extends AbstractNewRepresentationCommand {

  public NewRepresentationCommand(String newName, EObject eObject, RepresentationDescription repDescription, Session session) {
    super(newName,eObject,repDescription,session);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @SuppressWarnings("synthetic-access")
  public void run() {
    NullProgressMonitor monitor = new NullProgressMonitor();
    if (eObject instanceof Scenario) {
      Scenario scenario = (Scenario) eObject;
      scenario.setName(newName);
    }

    String eventName = Messages.CreateRepresentationLabel;
    String eventContext = repDescription.getName();
    String addendum = IdManager.getInstance().getId(eObject);
    UsageMonitoringLogger.getInstance().log(eventName, eventContext, EventStatus.NONE, addendum);
    representation = DialectManager.INSTANCE.createRepresentation(newName, eObject, repDescription, currentSession,
        monitor);
    UsageMonitoringLogger.getInstance().log(eventName, eventContext, EventStatus.OK, addendum);
  }
}
