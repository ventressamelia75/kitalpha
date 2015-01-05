/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.precondition.runner;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * 
 * @author Faycal Abka
 *
 */
public interface IPreconditionRunner<T> {
	public void run(T type, IProgressMonitor monitor);
}