/**
 */
package com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api;

import org.eclipse.emf.ecore.EObject;

import com.airbus.ds.mss.core.common.jpa.persistence.datamodel.missionplanningdefaults.enums.DogHouseSide;
import com.airbus.ds.mss.core.common.jpa.persistence.datamodel.missionplanningdefaults.enums.DogHouseValues;
import com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.Coordinate;
import com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.MSSColor;
import com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.MSSFont;
import com.airbus.ds.mss.core.mp.missiondata.baseTypes.unit.api.Distance;
import com.airbus.ds.mss.core.mp.missiondata.route.api.PiCap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dog House Symbol Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseSide <em>Dog House
 * Side</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseBackgroundColor
 * <em>Dog House Background Color</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseBorderColor <em>Dog
 * House Border Color</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseTextColor <em>Dog
 * House Text Color</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseTransparency
 * <em>Dog House Transparency</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseBorderWidth <em>Dog
 * House Border Width</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseFont <em>Dog House
 * Font</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseDistance <em>Dog
 * House Distance</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHousePosition <em>Dog
 * House Position</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getPiCap <em>Pi Cap</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseAttributeField1
 * <em>Dog House Attribute Field1</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseAttributeField2
 * <em>Dog House Attribute Field2</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseAttributeField3
 * <em>Dog House Attribute Field3</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseAttributeField4
 * <em>Dog House Attribute Field4</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseAttributeField5
 * <em>Dog House Attribute Field5</em>}</li>
 * <li>{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#isDogHouseManualPos <em>Dog
 * House Manual Pos</em>}</li>
 * </ul>
 *
 * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo()
 * @model
 * @generated
 */
public interface DogHouseSymbolInfo extends EObject {

    /**
     * Returns the value of the '<em><b>Dog House Side</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Side</em>' attribute.
     * @see #setDogHouseSide(DogHouseSide)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseSide()
     * @model dataType="com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.DogHouseSide"
     * @generated
     */
    DogHouseSide getDogHouseSide();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseSide <em>Dog House
     * Side</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Side</em>' attribute.
     * @see #getDogHouseSide()
     * @generated
     */
    void setDogHouseSide(DogHouseSide value);

    /**
     * Returns the value of the '<em><b>Dog House Attribute Field1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Attribute Field1</em>' attribute.
     * @see #setDogHouseAttributeField1(DogHouseValues)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseAttributeField1()
     * @model dataType="com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.DogHouseValues"
     * @generated
     */
    DogHouseValues getDogHouseAttributeField1();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseAttributeField1
     * <em>Dog House Attribute Field1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Attribute Field1</em>' attribute.
     * @see #getDogHouseAttributeField1()
     * @generated
     */
    void setDogHouseAttributeField1(DogHouseValues value);

    /**
     * Returns the value of the '<em><b>Dog House Attribute Field2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Attribute Field2</em>' attribute.
     * @see #setDogHouseAttributeField2(DogHouseValues)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseAttributeField2()
     * @model dataType="com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.DogHouseValues"
     * @generated
     */
    DogHouseValues getDogHouseAttributeField2();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseAttributeField2
     * <em>Dog House Attribute Field2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Attribute Field2</em>' attribute.
     * @see #getDogHouseAttributeField2()
     * @generated
     */
    void setDogHouseAttributeField2(DogHouseValues value);

    /**
     * Returns the value of the '<em><b>Dog House Attribute Field3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Attribute Field3</em>' attribute.
     * @see #setDogHouseAttributeField3(DogHouseValues)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseAttributeField3()
     * @model dataType="com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.DogHouseValues"
     * @generated
     */
    DogHouseValues getDogHouseAttributeField3();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseAttributeField3
     * <em>Dog House Attribute Field3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Attribute Field3</em>' attribute.
     * @see #getDogHouseAttributeField3()
     * @generated
     */
    void setDogHouseAttributeField3(DogHouseValues value);

    /**
     * Returns the value of the '<em><b>Dog House Attribute Field4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Attribute Field4</em>' attribute.
     * @see #setDogHouseAttributeField4(DogHouseValues)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseAttributeField4()
     * @model dataType="com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.DogHouseValues"
     * @generated
     */
    DogHouseValues getDogHouseAttributeField4();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseAttributeField4
     * <em>Dog House Attribute Field4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Attribute Field4</em>' attribute.
     * @see #getDogHouseAttributeField4()
     * @generated
     */
    void setDogHouseAttributeField4(DogHouseValues value);

    /**
     * Returns the value of the '<em><b>Dog House Attribute Field5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Attribute Field5</em>' attribute.
     * @see #setDogHouseAttributeField5(DogHouseValues)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseAttributeField5()
     * @model dataType="com.airbus.ds.mss.core.mp.missiondata.baseTypes.api.DogHouseValues"
     * @generated
     */
    DogHouseValues getDogHouseAttributeField5();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseAttributeField5
     * <em>Dog House Attribute Field5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Attribute Field5</em>' attribute.
     * @see #getDogHouseAttributeField5()
     * @generated
     */
    void setDogHouseAttributeField5(DogHouseValues value);

    /**
     * Returns the value of the '<em><b>Dog House Manual Pos</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Manual Pos</em>' attribute.
     * @see #setDogHouseManualPos(boolean)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseManualPos()
     * @model default="false"
     * @generated
     */
    boolean isDogHouseManualPos();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#isDogHouseManualPos <em>Dog
     * House Manual Pos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Manual Pos</em>' attribute.
     * @see #isDogHouseManualPos()
     * @generated
     */
    void setDogHouseManualPos(boolean value);

    /**
     * Returns the value of the '<em><b>Dog House Background Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Background Color</em>' containment reference.
     * @see #setDogHouseBackgroundColor(MSSColor)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseBackgroundColor()
     * @model containment="true" required="true"
     * @generated
     */
    MSSColor getDogHouseBackgroundColor();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseBackgroundColor
     * <em>Dog House Background Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Background Color</em>' containment reference.
     * @see #getDogHouseBackgroundColor()
     * @generated
     */
    void setDogHouseBackgroundColor(MSSColor value);

    /**
     * Returns the value of the '<em><b>Dog House Border Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Border Color</em>' containment reference.
     * @see #setDogHouseBorderColor(MSSColor)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseBorderColor()
     * @model containment="true" required="true"
     * @generated
     */
    MSSColor getDogHouseBorderColor();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseBorderColor
     * <em>Dog House Border Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Border Color</em>' containment reference.
     * @see #getDogHouseBorderColor()
     * @generated
     */
    void setDogHouseBorderColor(MSSColor value);

    /**
     * Returns the value of the '<em><b>Dog House Text Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Text Color</em>' containment reference.
     * @see #setDogHouseTextColor(MSSColor)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseTextColor()
     * @model containment="true" required="true"
     * @generated
     */
    MSSColor getDogHouseTextColor();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseTextColor <em>Dog
     * House Text Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Text Color</em>' containment reference.
     * @see #getDogHouseTextColor()
     * @generated
     */
    void setDogHouseTextColor(MSSColor value);

    /**
     * Returns the value of the '<em><b>Dog House Transparency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Transparency</em>' attribute.
     * @see #setDogHouseTransparency(double)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseTransparency()
     * @model
     * @generated
     */
    double getDogHouseTransparency();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseTransparency
     * <em>Dog House Transparency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Transparency</em>' attribute.
     * @see #getDogHouseTransparency()
     * @generated
     */
    void setDogHouseTransparency(double value);

    /**
     * Returns the value of the '<em><b>Dog House Border Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Border Width</em>' attribute.
     * @see #setDogHouseBorderWidth(int)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseBorderWidth()
     * @model
     * @generated
     */
    int getDogHouseBorderWidth();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseBorderWidth
     * <em>Dog House Border Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Border Width</em>' attribute.
     * @see #getDogHouseBorderWidth()
     * @generated
     */
    void setDogHouseBorderWidth(int value);

    /**
     * Returns the value of the '<em><b>Dog House Font</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Font</em>' containment reference.
     * @see #setDogHouseFont(MSSFont)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseFont()
     * @model containment="true"
     * @generated
     */
    MSSFont getDogHouseFont();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseFont <em>Dog House
     * Font</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Font</em>' containment reference.
     * @see #getDogHouseFont()
     * @generated
     */
    void setDogHouseFont(MSSFont value);

    /**
     * Returns the value of the '<em><b>Dog House Distance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Distance</em>' containment reference.
     * @see #setDogHouseDistance(Distance)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHouseDistance()
     * @model containment="true"
     * @generated
     */
    Distance getDogHouseDistance();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHouseDistance <em>Dog
     * House Distance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Distance</em>' containment reference.
     * @see #getDogHouseDistance()
     * @generated
     */
    void setDogHouseDistance(Distance value);

    /**
     * Returns the value of the '<em><b>Dog House Position</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dog House Position</em>' containment reference.
     * @see #setDogHousePosition(Coordinate)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_DogHousePosition()
     * @model containment="true"
     * @generated
     */
    Coordinate getDogHousePosition();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getDogHousePosition <em>Dog
     * House Position</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dog House Position</em>' containment reference.
     * @see #getDogHousePosition()
     * @generated
     */
    void setDogHousePosition(Coordinate value);

    /**
     * Returns the value of the '<em><b>Pi Cap</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Pi Cap</em>' reference.
     * @see #setPiCap(PiCap)
     * @see com.airbus.ds.mss.core.mp.missiondata.charts.symbols.CoreChartsSymbolsPackage#getDogHouseSymbolInfo_PiCap()
     * @model
     * @generated
     */
    PiCap getPiCap();

    /**
     * Sets the value of the
     * '{@link com.airbus.ds.mss.core.mp.missiondata.charts.symbols.api.DogHouseSymbolInfo#getPiCap <em>Pi Cap</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Pi Cap</em>' reference.
     * @see #getPiCap()
     * @generated
     */
    void setPiCap(PiCap value);

} // DogHouseSymbolInfo
