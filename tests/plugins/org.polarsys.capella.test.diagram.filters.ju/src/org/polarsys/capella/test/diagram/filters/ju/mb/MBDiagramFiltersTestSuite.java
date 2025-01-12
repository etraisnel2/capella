/*******************************************************************************
 * Copyright (c) 2019, 2020 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.test.diagram.filters.ju.mb;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.test.framework.api.BasicTestArtefact;
import org.polarsys.capella.test.framework.api.BasicTestSuite;

public class MBDiagramFiltersTestSuite extends BasicTestSuite {

  @Override
  protected List<BasicTestArtefact> getTests() {
    List<BasicTestArtefact> tests = new ArrayList<>();
    tests.add(new HideActorGeneralizationsForMB());
    tests.add(new HideActorInvolvementsForMB());
    tests.add(new HideActorsForMB());
    tests.add(new HideCapabilitiesForMB());
    tests.add(new HideCapabilityExploitationsForMB());
    tests.add(new HideMissionsForMB());
    tests.add(new HidePropertyValuesForMB());
    tests.add(new HideCapabilityGeneralizationsForMB());
    return tests;
  }

}
