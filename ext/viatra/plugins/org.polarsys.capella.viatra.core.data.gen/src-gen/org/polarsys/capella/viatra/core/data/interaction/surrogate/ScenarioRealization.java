/**
 * 
 *   Copyright (c) 2006, 2020 THALES DMS FRANCE.
 *   
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 *  
 *   Contributors:
 *      Thales - initial API and implementation
 *  
 */
package org.polarsys.capella.viatra.core.data.interaction.surrogate;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in ScenarioRealization.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ScenarioRealization.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.polarsys.capella.viatra.core.data.interaction.surrogate, the group contains the definition of the following patterns: <ul>
 * <li>ScenarioRealization__realizedScenario</li>
 * <li>ScenarioRealization__realizingScenario</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ScenarioRealization extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ScenarioRealization instance() {
    if (INSTANCE == null) {
        INSTANCE = new ScenarioRealization();
    }
    return INSTANCE;
  }
  
  private static ScenarioRealization INSTANCE;
  
  private ScenarioRealization() {
    querySpecifications.add(ScenarioRealization__realizedScenario.instance());
    querySpecifications.add(ScenarioRealization__realizingScenario.instance());
  }
  
  public ScenarioRealization__realizedScenario getScenarioRealization__realizedScenario() {
    return ScenarioRealization__realizedScenario.instance();
  }
  
  public ScenarioRealization__realizedScenario.Matcher getScenarioRealization__realizedScenario(final ViatraQueryEngine engine) {
    return ScenarioRealization__realizedScenario.Matcher.on(engine);
  }
  
  public ScenarioRealization__realizingScenario getScenarioRealization__realizingScenario() {
    return ScenarioRealization__realizingScenario.instance();
  }
  
  public ScenarioRealization__realizingScenario.Matcher getScenarioRealization__realizingScenario(final ViatraQueryEngine engine) {
    return ScenarioRealization__realizingScenario.Matcher.on(engine);
  }
}
