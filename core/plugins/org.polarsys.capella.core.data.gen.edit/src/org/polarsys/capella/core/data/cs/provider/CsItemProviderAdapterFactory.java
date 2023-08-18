/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.core.data.cs.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.polarsys.capella.core.data.capellamodeller.provider.CapellaModellerEditPlugin;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.util.CsAdapterFactory;
import org.polarsys.kitalpha.emde.extension.edit.ChildCreationExtenderManager;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CsItemProviderAdapterFactory extends CsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
   * This helps manage the child creation extenders.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(CapellaModellerEditPlugin.INSTANCE, CsPackage.eNS_URI);

	/**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
   * This constructs an instance.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CsItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.Part} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PartItemProvider partItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.Part}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPartAdapter() {
    if (partItemProvider == null) {
      partItemProvider = new PartItemProvider(this);
    }

    return partItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.ComponentRealization} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ComponentRealizationItemProvider componentRealizationItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.ComponentRealization}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createComponentRealizationAdapter() {
    if (componentRealizationItemProvider == null) {
      componentRealizationItemProvider = new ComponentRealizationItemProvider(this);
    }

    return componentRealizationItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.InterfacePkg} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected InterfacePkgItemProvider interfacePkgItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.InterfacePkg}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createInterfacePkgAdapter() {
    if (interfacePkgItemProvider == null) {
      interfacePkgItemProvider = new InterfacePkgItemProvider(this);
    }

    return interfacePkgItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.Interface} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected InterfaceItemProvider interfaceItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.Interface}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createInterfaceAdapter() {
    if (interfaceItemProvider == null) {
      interfaceItemProvider = new InterfaceItemProvider(this);
    }

    return interfaceItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.InterfaceImplementation} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected InterfaceImplementationItemProvider interfaceImplementationItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.InterfaceImplementation}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createInterfaceImplementationAdapter() {
    if (interfaceImplementationItemProvider == null) {
      interfaceImplementationItemProvider = new InterfaceImplementationItemProvider(this);
    }

    return interfaceImplementationItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.InterfaceUse} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected InterfaceUseItemProvider interfaceUseItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.InterfaceUse}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createInterfaceUseAdapter() {
    if (interfaceUseItemProvider == null) {
      interfaceUseItemProvider = new InterfaceUseItemProvider(this);
    }

    return interfaceUseItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.ExchangeItemAllocation} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ExchangeItemAllocationItemProvider exchangeItemAllocationItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.ExchangeItemAllocation}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createExchangeItemAllocationAdapter() {
    if (exchangeItemAllocationItemProvider == null) {
      exchangeItemAllocationItemProvider = new ExchangeItemAllocationItemProvider(this);
    }

    return exchangeItemAllocationItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.PhysicalLink} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhysicalLinkItemProvider physicalLinkItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.PhysicalLink}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPhysicalLinkAdapter() {
    if (physicalLinkItemProvider == null) {
      physicalLinkItemProvider = new PhysicalLinkItemProvider(this);
    }

    return physicalLinkItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.PhysicalLinkCategory} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhysicalLinkCategoryItemProvider physicalLinkCategoryItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.PhysicalLinkCategory}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPhysicalLinkCategoryAdapter() {
    if (physicalLinkCategoryItemProvider == null) {
      physicalLinkCategoryItemProvider = new PhysicalLinkCategoryItemProvider(this);
    }

    return physicalLinkCategoryItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.PhysicalLinkEnd} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhysicalLinkEndItemProvider physicalLinkEndItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.PhysicalLinkEnd}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPhysicalLinkEndAdapter() {
    if (physicalLinkEndItemProvider == null) {
      physicalLinkEndItemProvider = new PhysicalLinkEndItemProvider(this);
    }

    return physicalLinkEndItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.PhysicalLinkRealization} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhysicalLinkRealizationItemProvider physicalLinkRealizationItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.PhysicalLinkRealization}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPhysicalLinkRealizationAdapter() {
    if (physicalLinkRealizationItemProvider == null) {
      physicalLinkRealizationItemProvider = new PhysicalLinkRealizationItemProvider(this);
    }

    return physicalLinkRealizationItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.PhysicalPath} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhysicalPathItemProvider physicalPathItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.PhysicalPath}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPhysicalPathAdapter() {
    if (physicalPathItemProvider == null) {
      physicalPathItemProvider = new PhysicalPathItemProvider(this);
    }

    return physicalPathItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.PhysicalPathInvolvement} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhysicalPathInvolvementItemProvider physicalPathInvolvementItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.PhysicalPathInvolvement}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPhysicalPathInvolvementAdapter() {
    if (physicalPathInvolvementItemProvider == null) {
      physicalPathInvolvementItemProvider = new PhysicalPathInvolvementItemProvider(this);
    }

    return physicalPathInvolvementItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.PhysicalPathReference} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhysicalPathReferenceItemProvider physicalPathReferenceItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.PhysicalPathReference}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPhysicalPathReferenceAdapter() {
    if (physicalPathReferenceItemProvider == null) {
      physicalPathReferenceItemProvider = new PhysicalPathReferenceItemProvider(this);
    }

    return physicalPathReferenceItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.PhysicalPathRealization} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhysicalPathRealizationItemProvider physicalPathRealizationItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.PhysicalPathRealization}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPhysicalPathRealizationAdapter() {
    if (physicalPathRealizationItemProvider == null) {
      physicalPathRealizationItemProvider = new PhysicalPathRealizationItemProvider(this);
    }

    return physicalPathRealizationItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.PhysicalPort} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhysicalPortItemProvider physicalPortItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.PhysicalPort}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPhysicalPortAdapter() {
    if (physicalPortItemProvider == null) {
      physicalPortItemProvider = new PhysicalPortItemProvider(this);
    }

    return physicalPortItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.cs.PhysicalPortRealization} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhysicalPortRealizationItemProvider physicalPortRealizationItemProvider;

	/**
   * This creates an adapter for a {@link org.polarsys.capella.core.data.cs.PhysicalPortRealization}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createPhysicalPortRealizationAdapter() {
    if (physicalPortRealizationItemProvider == null) {
      physicalPortRealizationItemProvider = new PhysicalPortRealizationItemProvider(this);
    }

    return physicalPortRealizationItemProvider;
  }

	/**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

	/**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
    this.parentAdapterFactory = parentAdapterFactory;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object type) {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

	/**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
    return super.adapt(notifier, this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object adapt(Object object, Object type) {
    if (isFactoryForType(type)) {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
        return adapter;
      }
    }

    return null;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public List<IChildCreationExtender> getChildCreationExtenders() {
    return childCreationExtenderManager.getChildCreationExtenders();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
    return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResourceLocator getResourceLocator() {
    return childCreationExtenderManager;
  }

	/**
   * This adds a listener.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.addListener(notifyChangedListener);
  }

	/**
   * This removes a listener.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.removeListener(notifyChangedListener);
  }

	/**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void fireNotifyChanged(Notification notification) {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null) {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

	/**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void dispose() {
    if (partItemProvider != null) partItemProvider.dispose();
    if (componentRealizationItemProvider != null) componentRealizationItemProvider.dispose();
    if (interfacePkgItemProvider != null) interfacePkgItemProvider.dispose();
    if (interfaceItemProvider != null) interfaceItemProvider.dispose();
    if (interfaceImplementationItemProvider != null) interfaceImplementationItemProvider.dispose();
    if (interfaceUseItemProvider != null) interfaceUseItemProvider.dispose();
    if (exchangeItemAllocationItemProvider != null) exchangeItemAllocationItemProvider.dispose();
    if (physicalLinkItemProvider != null) physicalLinkItemProvider.dispose();
    if (physicalLinkCategoryItemProvider != null) physicalLinkCategoryItemProvider.dispose();
    if (physicalLinkEndItemProvider != null) physicalLinkEndItemProvider.dispose();
    if (physicalLinkRealizationItemProvider != null) physicalLinkRealizationItemProvider.dispose();
    if (physicalPathItemProvider != null) physicalPathItemProvider.dispose();
    if (physicalPathInvolvementItemProvider != null) physicalPathInvolvementItemProvider.dispose();
    if (physicalPathReferenceItemProvider != null) physicalPathReferenceItemProvider.dispose();
    if (physicalPathRealizationItemProvider != null) physicalPathRealizationItemProvider.dispose();
    if (physicalPortItemProvider != null) physicalPortItemProvider.dispose();
    if (physicalPortRealizationItemProvider != null) physicalPortRealizationItemProvider.dispose();
  }

}
