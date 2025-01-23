/**
 */
package com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.airbus.ds.mss.core.common.jpa.persistence.datamodel.missionplanningdefaults.enums.DogHouseSide;
import com.airbus.ds.mss.core.common.jpa.persistence.datamodel.missionplanningdefaults.enums.DogHouseValues;
import com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.Coordinate;
import com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.MSSColor;
import com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.MSSFont;
import com.airbus.ds.mss.core.mp.missiondata.baseTypes.unit.api.Distance;
import com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage;
import com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo;
import com.airbus.ds.mss.core.mp.missiondata.route.api.PiCap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dog House Symbol Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseSide <em>Dog
 * House Side</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseBackgroundColor
 * <em>Dog House Background Color</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseBorderColor
 * <em>Dog House Border Color</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseTextColor
 * <em>Dog House Text Color</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseTransparency
 * <em>Dog House Transparency</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseBorderWidth
 * <em>Dog House Border Width</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseFont <em>Dog
 * House Font</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseDistance
 * <em>Dog House Distance</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHousePosition
 * <em>Dog House Position</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getPiCap <em>Pi
 * Cap</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseAttributeField1
 * <em>Dog House Attribute Field1</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseAttributeField2
 * <em>Dog House Attribute Field2</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseAttributeField3
 * <em>Dog House Attribute Field3</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseAttributeField4
 * <em>Dog House Attribute Field4</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#getDogHouseAttributeField5
 * <em>Dog House Attribute Field5</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.impl.DogHouseSymbolInfoImpl#isDogHouseManualPos
 * <em>Dog House Manual Pos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DogHouseSymbolInfoImpl extends MinimalEObjectImpl.Container implements DogHouseSymbolInfo {

    /**
     * The default value of the '{@link #getDogHouseSide() <em>Dog House Side</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseSide()
     * @generated
     * @ordered
     */
    protected static final DogHouseSide DOG_HOUSE_SIDE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDogHouseSide() <em>Dog House Side</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseSide()
     * @generated
     * @ordered
     */
    protected DogHouseSide dogHouseSide = DOG_HOUSE_SIDE_EDEFAULT;

    /**
     * The cached value of the '{@link #getDogHouseBackgroundColor() <em>Dog House Background Color</em>}' containment
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseBackgroundColor()
     * @generated
     * @ordered
     */
    protected MSSColor dogHouseBackgroundColor;

    /**
     * The cached value of the '{@link #getDogHouseBorderColor() <em>Dog House Border Color</em>}' containment
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseBorderColor()
     * @generated
     * @ordered
     */
    protected MSSColor dogHouseBorderColor;

    /**
     * The cached value of the '{@link #getDogHouseTextColor() <em>Dog House Text Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseTextColor()
     * @generated
     * @ordered
     */
    protected MSSColor dogHouseTextColor;

    /**
     * The default value of the '{@link #getDogHouseTransparency() <em>Dog House Transparency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseTransparency()
     * @generated
     * @ordered
     */
    protected static final double DOG_HOUSE_TRANSPARENCY_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getDogHouseTransparency() <em>Dog House Transparency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseTransparency()
     * @generated
     * @ordered
     */
    protected double dogHouseTransparency = DOG_HOUSE_TRANSPARENCY_EDEFAULT;

    /**
     * The default value of the '{@link #getDogHouseBorderWidth() <em>Dog House Border Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseBorderWidth()
     * @generated
     * @ordered
     */
    protected static final int DOG_HOUSE_BORDER_WIDTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDogHouseBorderWidth() <em>Dog House Border Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseBorderWidth()
     * @generated
     * @ordered
     */
    protected int dogHouseBorderWidth = DOG_HOUSE_BORDER_WIDTH_EDEFAULT;

    /**
     * The cached value of the '{@link #getDogHouseFont() <em>Dog House Font</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseFont()
     * @generated
     * @ordered
     */
    protected MSSFont dogHouseFont;

    /**
     * The cached value of the '{@link #getDogHouseDistance() <em>Dog House Distance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseDistance()
     * @generated
     * @ordered
     */
    protected Distance dogHouseDistance;

    /**
     * The cached value of the '{@link #getDogHousePosition() <em>Dog House Position</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHousePosition()
     * @generated
     * @ordered
     */
    protected Coordinate dogHousePosition;

    /**
     * The cached value of the '{@link #getPiCap() <em>Pi Cap</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPiCap()
     * @generated
     * @ordered
     */
    protected PiCap piCap;

    /**
     * The default value of the '{@link #getDogHouseAttributeField1() <em>Dog House Attribute Field1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseAttributeField1()
     * @generated
     * @ordered
     */
    protected static final DogHouseValues DOG_HOUSE_ATTRIBUTE_FIELD1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDogHouseAttributeField1() <em>Dog House Attribute Field1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseAttributeField1()
     * @generated
     * @ordered
     */
    protected DogHouseValues dogHouseAttributeField1 = DOG_HOUSE_ATTRIBUTE_FIELD1_EDEFAULT;

    /**
     * The default value of the '{@link #getDogHouseAttributeField2() <em>Dog House Attribute Field2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseAttributeField2()
     * @generated
     * @ordered
     */
    protected static final DogHouseValues DOG_HOUSE_ATTRIBUTE_FIELD2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDogHouseAttributeField2() <em>Dog House Attribute Field2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseAttributeField2()
     * @generated
     * @ordered
     */
    protected DogHouseValues dogHouseAttributeField2 = DOG_HOUSE_ATTRIBUTE_FIELD2_EDEFAULT;

    /**
     * The default value of the '{@link #getDogHouseAttributeField3() <em>Dog House Attribute Field3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseAttributeField3()
     * @generated
     * @ordered
     */
    protected static final DogHouseValues DOG_HOUSE_ATTRIBUTE_FIELD3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDogHouseAttributeField3() <em>Dog House Attribute Field3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseAttributeField3()
     * @generated
     * @ordered
     */
    protected DogHouseValues dogHouseAttributeField3 = DOG_HOUSE_ATTRIBUTE_FIELD3_EDEFAULT;

    /**
     * The default value of the '{@link #getDogHouseAttributeField4() <em>Dog House Attribute Field4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseAttributeField4()
     * @generated
     * @ordered
     */
    protected static final DogHouseValues DOG_HOUSE_ATTRIBUTE_FIELD4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDogHouseAttributeField4() <em>Dog House Attribute Field4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseAttributeField4()
     * @generated
     * @ordered
     */
    protected DogHouseValues dogHouseAttributeField4 = DOG_HOUSE_ATTRIBUTE_FIELD4_EDEFAULT;

    /**
     * The default value of the '{@link #getDogHouseAttributeField5() <em>Dog House Attribute Field5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseAttributeField5()
     * @generated
     * @ordered
     */
    protected static final DogHouseValues DOG_HOUSE_ATTRIBUTE_FIELD5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDogHouseAttributeField5() <em>Dog House Attribute Field5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDogHouseAttributeField5()
     * @generated
     * @ordered
     */
    protected DogHouseValues dogHouseAttributeField5 = DOG_HOUSE_ATTRIBUTE_FIELD5_EDEFAULT;

    /**
     * The default value of the '{@link #isDogHouseManualPos() <em>Dog House Manual Pos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #isDogHouseManualPos()
     * @generated
     * @ordered
     */
    protected static final boolean DOG_HOUSE_MANUAL_POS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDogHouseManualPos() <em>Dog House Manual Pos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #isDogHouseManualPos()
     * @generated
     * @ordered
     */
    protected boolean dogHouseManualPos = DOG_HOUSE_MANUAL_POS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected DogHouseSymbolInfoImpl() {
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CoreChartsSymbolsPackage.Literals.DOG_HOUSE_SYMBOL_INFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DogHouseSide getDogHouseSide() {
        return dogHouseSide;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseSide(DogHouseSide newDogHouseSide) {
        DogHouseSide oldDogHouseSide = dogHouseSide;
        dogHouseSide = newDogHouseSide;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_SIDE, oldDogHouseSide,
                    dogHouseSide));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DogHouseValues getDogHouseAttributeField1() {
        return dogHouseAttributeField1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseAttributeField1(DogHouseValues newDogHouseAttributeField1) {
        DogHouseValues oldDogHouseAttributeField1 = dogHouseAttributeField1;
        dogHouseAttributeField1 = newDogHouseAttributeField1;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD1,
                    oldDogHouseAttributeField1, dogHouseAttributeField1));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DogHouseValues getDogHouseAttributeField2() {
        return dogHouseAttributeField2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseAttributeField2(DogHouseValues newDogHouseAttributeField2) {
        DogHouseValues oldDogHouseAttributeField2 = dogHouseAttributeField2;
        dogHouseAttributeField2 = newDogHouseAttributeField2;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD2,
                    oldDogHouseAttributeField2, dogHouseAttributeField2));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DogHouseValues getDogHouseAttributeField3() {
        return dogHouseAttributeField3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseAttributeField3(DogHouseValues newDogHouseAttributeField3) {
        DogHouseValues oldDogHouseAttributeField3 = dogHouseAttributeField3;
        dogHouseAttributeField3 = newDogHouseAttributeField3;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD3,
                    oldDogHouseAttributeField3, dogHouseAttributeField3));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DogHouseValues getDogHouseAttributeField4() {
        return dogHouseAttributeField4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseAttributeField4(DogHouseValues newDogHouseAttributeField4) {
        DogHouseValues oldDogHouseAttributeField4 = dogHouseAttributeField4;
        dogHouseAttributeField4 = newDogHouseAttributeField4;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD4,
                    oldDogHouseAttributeField4, dogHouseAttributeField4));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DogHouseValues getDogHouseAttributeField5() {
        return dogHouseAttributeField5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseAttributeField5(DogHouseValues newDogHouseAttributeField5) {
        DogHouseValues oldDogHouseAttributeField5 = dogHouseAttributeField5;
        dogHouseAttributeField5 = newDogHouseAttributeField5;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD5,
                    oldDogHouseAttributeField5, dogHouseAttributeField5));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isDogHouseManualPos() {
        return dogHouseManualPos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseManualPos(boolean newDogHouseManualPos) {
        boolean oldDogHouseManualPos = dogHouseManualPos;
        dogHouseManualPos = newDogHouseManualPos;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_MANUAL_POS, oldDogHouseManualPos,
                    dogHouseManualPos));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MSSColor getDogHouseBackgroundColor() {
        return dogHouseBackgroundColor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetDogHouseBackgroundColor(MSSColor newDogHouseBackgroundColor, NotificationChain msgs) {
        MSSColor oldDogHouseBackgroundColor = dogHouseBackgroundColor;
        dogHouseBackgroundColor = newDogHouseBackgroundColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BACKGROUND_COLOR, oldDogHouseBackgroundColor, newDogHouseBackgroundColor);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseBackgroundColor(MSSColor newDogHouseBackgroundColor) {
        if (newDogHouseBackgroundColor != dogHouseBackgroundColor) {
            NotificationChain msgs = null;
            if (dogHouseBackgroundColor != null) {
                msgs = ((InternalEObject) dogHouseBackgroundColor).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BACKGROUND_COLOR, null, msgs);
            }
            if (newDogHouseBackgroundColor != null) {
                msgs = ((InternalEObject) newDogHouseBackgroundColor).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BACKGROUND_COLOR, null, msgs);
            }
            msgs = basicSetDogHouseBackgroundColor(newDogHouseBackgroundColor, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BACKGROUND_COLOR,
                    newDogHouseBackgroundColor, newDogHouseBackgroundColor));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MSSColor getDogHouseBorderColor() {
        return dogHouseBorderColor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetDogHouseBorderColor(MSSColor newDogHouseBorderColor, NotificationChain msgs) {
        MSSColor oldDogHouseBorderColor = dogHouseBorderColor;
        dogHouseBorderColor = newDogHouseBorderColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_COLOR, oldDogHouseBorderColor, newDogHouseBorderColor);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseBorderColor(MSSColor newDogHouseBorderColor) {
        if (newDogHouseBorderColor != dogHouseBorderColor) {
            NotificationChain msgs = null;
            if (dogHouseBorderColor != null) {
                msgs = ((InternalEObject) dogHouseBorderColor).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_COLOR, null, msgs);
            }
            if (newDogHouseBorderColor != null) {
                msgs = ((InternalEObject) newDogHouseBorderColor).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_COLOR, null, msgs);
            }
            msgs = basicSetDogHouseBorderColor(newDogHouseBorderColor, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_COLOR,
                    newDogHouseBorderColor, newDogHouseBorderColor));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MSSColor getDogHouseTextColor() {
        return dogHouseTextColor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetDogHouseTextColor(MSSColor newDogHouseTextColor, NotificationChain msgs) {
        MSSColor oldDogHouseTextColor = dogHouseTextColor;
        dogHouseTextColor = newDogHouseTextColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TEXT_COLOR,
                    oldDogHouseTextColor, newDogHouseTextColor);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseTextColor(MSSColor newDogHouseTextColor) {
        if (newDogHouseTextColor != dogHouseTextColor) {
            NotificationChain msgs = null;
            if (dogHouseTextColor != null) {
                msgs = ((InternalEObject) dogHouseTextColor).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TEXT_COLOR, null, msgs);
            }
            if (newDogHouseTextColor != null) {
                msgs = ((InternalEObject) newDogHouseTextColor).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TEXT_COLOR, null, msgs);
            }
            msgs = basicSetDogHouseTextColor(newDogHouseTextColor, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TEXT_COLOR, newDogHouseTextColor,
                    newDogHouseTextColor));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getDogHouseTransparency() {
        return dogHouseTransparency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseTransparency(double newDogHouseTransparency) {
        double oldDogHouseTransparency = dogHouseTransparency;
        dogHouseTransparency = newDogHouseTransparency;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TRANSPARENCY,
                    oldDogHouseTransparency, dogHouseTransparency));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getDogHouseBorderWidth() {
        return dogHouseBorderWidth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseBorderWidth(int newDogHouseBorderWidth) {
        int oldDogHouseBorderWidth = dogHouseBorderWidth;
        dogHouseBorderWidth = newDogHouseBorderWidth;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_WIDTH,
                    oldDogHouseBorderWidth, dogHouseBorderWidth));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MSSFont getDogHouseFont() {
        return dogHouseFont;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetDogHouseFont(MSSFont newDogHouseFont, NotificationChain msgs) {
        MSSFont oldDogHouseFont = dogHouseFont;
        dogHouseFont = newDogHouseFont;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_FONT,
                    oldDogHouseFont, newDogHouseFont);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseFont(MSSFont newDogHouseFont) {
        if (newDogHouseFont != dogHouseFont) {
            NotificationChain msgs = null;
            if (dogHouseFont != null) {
                msgs = ((InternalEObject) dogHouseFont).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_FONT, null, msgs);
            }
            if (newDogHouseFont != null) {
                msgs = ((InternalEObject) newDogHouseFont).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_FONT, null, msgs);
            }
            msgs = basicSetDogHouseFont(newDogHouseFont, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_FONT, newDogHouseFont,
                    newDogHouseFont));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Distance getDogHouseDistance() {
        return dogHouseDistance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetDogHouseDistance(Distance newDogHouseDistance, NotificationChain msgs) {
        Distance oldDogHouseDistance = dogHouseDistance;
        dogHouseDistance = newDogHouseDistance;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_DISTANCE,
                    oldDogHouseDistance, newDogHouseDistance);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHouseDistance(Distance newDogHouseDistance) {
        if (newDogHouseDistance != dogHouseDistance) {
            NotificationChain msgs = null;
            if (dogHouseDistance != null) {
                msgs = ((InternalEObject) dogHouseDistance).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_DISTANCE, null, msgs);
            }
            if (newDogHouseDistance != null) {
                msgs = ((InternalEObject) newDogHouseDistance).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_DISTANCE, null, msgs);
            }
            msgs = basicSetDogHouseDistance(newDogHouseDistance, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_DISTANCE, newDogHouseDistance,
                    newDogHouseDistance));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Coordinate getDogHousePosition() {
        return dogHousePosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetDogHousePosition(Coordinate newDogHousePosition, NotificationChain msgs) {
        Coordinate oldDogHousePosition = dogHousePosition;
        dogHousePosition = newDogHousePosition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_POSITION,
                    oldDogHousePosition, newDogHousePosition);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDogHousePosition(Coordinate newDogHousePosition) {
        if (newDogHousePosition != dogHousePosition) {
            NotificationChain msgs = null;
            if (dogHousePosition != null) {
                msgs = ((InternalEObject) dogHousePosition).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_POSITION, null, msgs);
            }
            if (newDogHousePosition != null) {
                msgs = ((InternalEObject) newDogHousePosition).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_POSITION, null, msgs);
            }
            msgs = basicSetDogHousePosition(newDogHousePosition, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_POSITION, newDogHousePosition,
                    newDogHousePosition));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PiCap getPiCap() {
        if (piCap != null && piCap.eIsProxy()) {
            InternalEObject oldPiCap = (InternalEObject) piCap;
            piCap = (PiCap) eResolveProxy(oldPiCap);
            if ((piCap != oldPiCap) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__PI_CAP, oldPiCap, piCap));
            }
        }
        return piCap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public PiCap basicGetPiCap() {
        return piCap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPiCap(PiCap newPiCap) {
        PiCap oldPiCap = piCap;
        piCap = newPiCap;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__PI_CAP, oldPiCap, piCap));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BACKGROUND_COLOR:
                return basicSetDogHouseBackgroundColor(null, msgs);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_COLOR:
                return basicSetDogHouseBorderColor(null, msgs);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TEXT_COLOR:
                return basicSetDogHouseTextColor(null, msgs);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_FONT:
                return basicSetDogHouseFont(null, msgs);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_DISTANCE:
                return basicSetDogHouseDistance(null, msgs);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_POSITION:
                return basicSetDogHousePosition(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_SIDE:
                return getDogHouseSide();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BACKGROUND_COLOR:
                return getDogHouseBackgroundColor();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_COLOR:
                return getDogHouseBorderColor();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TEXT_COLOR:
                return getDogHouseTextColor();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TRANSPARENCY:
                return getDogHouseTransparency();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_WIDTH:
                return getDogHouseBorderWidth();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_FONT:
                return getDogHouseFont();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_DISTANCE:
                return getDogHouseDistance();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_POSITION:
                return getDogHousePosition();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__PI_CAP:
                if (resolve) {
                    return getPiCap();
                }
                return basicGetPiCap();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD1:
                return getDogHouseAttributeField1();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD2:
                return getDogHouseAttributeField2();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD3:
                return getDogHouseAttributeField3();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD4:
                return getDogHouseAttributeField4();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD5:
                return getDogHouseAttributeField5();
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_MANUAL_POS:
                return isDogHouseManualPos();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_SIDE:
                setDogHouseSide((DogHouseSide) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BACKGROUND_COLOR:
                setDogHouseBackgroundColor((MSSColor) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_COLOR:
                setDogHouseBorderColor((MSSColor) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TEXT_COLOR:
                setDogHouseTextColor((MSSColor) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TRANSPARENCY:
                setDogHouseTransparency((Double) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_WIDTH:
                setDogHouseBorderWidth((Integer) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_FONT:
                setDogHouseFont((MSSFont) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_DISTANCE:
                setDogHouseDistance((Distance) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_POSITION:
                setDogHousePosition((Coordinate) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__PI_CAP:
                setPiCap((PiCap) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD1:
                setDogHouseAttributeField1((DogHouseValues) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD2:
                setDogHouseAttributeField2((DogHouseValues) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD3:
                setDogHouseAttributeField3((DogHouseValues) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD4:
                setDogHouseAttributeField4((DogHouseValues) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD5:
                setDogHouseAttributeField5((DogHouseValues) newValue);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_MANUAL_POS:
                setDogHouseManualPos((Boolean) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_SIDE:
                setDogHouseSide(DOG_HOUSE_SIDE_EDEFAULT);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BACKGROUND_COLOR:
                setDogHouseBackgroundColor((MSSColor) null);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_COLOR:
                setDogHouseBorderColor((MSSColor) null);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TEXT_COLOR:
                setDogHouseTextColor((MSSColor) null);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TRANSPARENCY:
                setDogHouseTransparency(DOG_HOUSE_TRANSPARENCY_EDEFAULT);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_WIDTH:
                setDogHouseBorderWidth(DOG_HOUSE_BORDER_WIDTH_EDEFAULT);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_FONT:
                setDogHouseFont((MSSFont) null);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_DISTANCE:
                setDogHouseDistance((Distance) null);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_POSITION:
                setDogHousePosition((Coordinate) null);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__PI_CAP:
                setPiCap((PiCap) null);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD1:
                setDogHouseAttributeField1(DOG_HOUSE_ATTRIBUTE_FIELD1_EDEFAULT);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD2:
                setDogHouseAttributeField2(DOG_HOUSE_ATTRIBUTE_FIELD2_EDEFAULT);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD3:
                setDogHouseAttributeField3(DOG_HOUSE_ATTRIBUTE_FIELD3_EDEFAULT);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD4:
                setDogHouseAttributeField4(DOG_HOUSE_ATTRIBUTE_FIELD4_EDEFAULT);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD5:
                setDogHouseAttributeField5(DOG_HOUSE_ATTRIBUTE_FIELD5_EDEFAULT);
                return;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_MANUAL_POS:
                setDogHouseManualPos(DOG_HOUSE_MANUAL_POS_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_SIDE:
                return DOG_HOUSE_SIDE_EDEFAULT == null ? dogHouseSide != null : !DOG_HOUSE_SIDE_EDEFAULT.equals(dogHouseSide);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BACKGROUND_COLOR:
                return dogHouseBackgroundColor != null;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_COLOR:
                return dogHouseBorderColor != null;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TEXT_COLOR:
                return dogHouseTextColor != null;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_TRANSPARENCY:
                return dogHouseTransparency != DOG_HOUSE_TRANSPARENCY_EDEFAULT;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_BORDER_WIDTH:
                return dogHouseBorderWidth != DOG_HOUSE_BORDER_WIDTH_EDEFAULT;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_FONT:
                return dogHouseFont != null;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_DISTANCE:
                return dogHouseDistance != null;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_POSITION:
                return dogHousePosition != null;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__PI_CAP:
                return piCap != null;
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD1:
                return DOG_HOUSE_ATTRIBUTE_FIELD1_EDEFAULT == null ? dogHouseAttributeField1 != null
                : !DOG_HOUSE_ATTRIBUTE_FIELD1_EDEFAULT.equals(dogHouseAttributeField1);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD2:
                return DOG_HOUSE_ATTRIBUTE_FIELD2_EDEFAULT == null ? dogHouseAttributeField2 != null
                : !DOG_HOUSE_ATTRIBUTE_FIELD2_EDEFAULT.equals(dogHouseAttributeField2);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD3:
                return DOG_HOUSE_ATTRIBUTE_FIELD3_EDEFAULT == null ? dogHouseAttributeField3 != null
                : !DOG_HOUSE_ATTRIBUTE_FIELD3_EDEFAULT.equals(dogHouseAttributeField3);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD4:
                return DOG_HOUSE_ATTRIBUTE_FIELD4_EDEFAULT == null ? dogHouseAttributeField4 != null
                : !DOG_HOUSE_ATTRIBUTE_FIELD4_EDEFAULT.equals(dogHouseAttributeField4);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_ATTRIBUTE_FIELD5:
                return DOG_HOUSE_ATTRIBUTE_FIELD5_EDEFAULT == null ? dogHouseAttributeField5 != null
                : !DOG_HOUSE_ATTRIBUTE_FIELD5_EDEFAULT.equals(dogHouseAttributeField5);
            case CoreChartsSymbolsPackage.DOG_HOUSE_SYMBOL_INFO__DOG_HOUSE_MANUAL_POS:
                return dogHouseManualPos != DOG_HOUSE_MANUAL_POS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (DogHouseSide: ");
        result.append(dogHouseSide);
        result.append(", dogHouseTransparency: ");
        result.append(dogHouseTransparency);
        result.append(", dogHouseBorderWidth: ");
        result.append(dogHouseBorderWidth);
        result.append(", DogHouseAttributeField1: ");
        result.append(dogHouseAttributeField1);
        result.append(", DogHouseAttributeField2: ");
        result.append(dogHouseAttributeField2);
        result.append(", DogHouseAttributeField3: ");
        result.append(dogHouseAttributeField3);
        result.append(", DogHouseAttributeField4: ");
        result.append(dogHouseAttributeField4);
        result.append(", DogHouseAttributeField5: ");
        result.append(dogHouseAttributeField5);
        result.append(", dogHouseManualPos: ");
        result.append(dogHouseManualPos);
        result.append(')');
        return result.toString();
    }

    public Object coordinateMacla() {
        // TODO Auto-generated method stub
        return null;
    }

} // DogHouseSymbolInfoImpl
