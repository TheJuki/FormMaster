package me.riddhimanadib.formmaster.model;

import com.github.vivchar.rendererrecyclerviewadapter.ItemModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adib on 16-Apr-17.
 */

public class BaseFormElement<T extends Object> implements ItemModel {

    // different types for the form elements
    public static final int TYPE_EDITTEXT_TEXT_SINGLELINE = 1;
    public static final int TYPE_EDITTEXT_TEXT_MULTILINE = 2;
    public static final int TYPE_EDITTEXT_NUMBER = 3;
    public static final int TYPE_EDITTEXT_EMAIL = 4;
    public static final int TYPE_EDITTEXT_PHONE = 5;
    public static final int TYPE_EDITTEXT_PASSWORD = 6;
    public static final int TYPE_EDITTEXT_AUTOCOMPLETE = 7;
    public static final int TYPE_PICKER_DATE = 8;
    public static final int TYPE_PICKER_TIME = 9;
    public static final int TYPE_PICKER_MULTI_CHECKBOX = 10;
    public static final int TYPE_PICKER_DROP_DOWN = 11;

    // private variables
    private int mTag; // unique tag to identify the object
    private int mType; // type for the form element
    private String mTitle; // title to be shown on left
    private T mValue; // value to be shown on right
    private List<T> mOptions; // list of options for single and multi picker
    private List<T> mOptionsSelected; // list of selected options for single and multi picker
    private String mHint; // value to be shown if mValue is null
    private String mError;
    private boolean mRequired; // value to set is the field is required
    private boolean mVisible = true;

    public BaseFormElement() {
    }

    /**
     * static method to create instance
     *
     * @return
     */
    public static BaseFormElement<String> createInstance() {
        return new BaseFormElement<>();
    }

    /**
     * static method to create instance using
     * custom generic value type
     * @return
     */
    public static <T> BaseFormElement<T> createGenericInstance() { return new BaseFormElement<T>(); }

    // getters and setters
    public BaseFormElement<T> setTag(int mTag) {
        this.mTag = mTag;
        return this;
    }

    public BaseFormElement<T> setType(int mType) {
        this.mType = mType;
        return this;
    }

    public BaseFormElement<T> setTitle(String mTitle) {
        this.mTitle = mTitle;
        return this;
    }

    public BaseFormElement<T> setValue(T mValue) {
        this.mValue = mValue;
        return this;
    }

    public BaseFormElement<T> setHint(String mHint) {
        this.mHint = mHint;
        return this;
    }

    public BaseFormElement<T> setError(String error) {
        this.mError = error;
        return this;
    }

    public BaseFormElement<T> setRequired(boolean required) {
        this.mRequired = required;
        return this;
    }

    public BaseFormElement<T> setVisible(boolean visible) {
        this.mVisible = visible;
        return this;
    }

    public BaseFormElement<T> setOptions(List<T> mOptions) {
        this.mOptions = mOptions;
        return this;
    }

    public BaseFormElement<T> setOptionsSelected(List<T> mOptionsSelected) {
        this.mOptionsSelected = mOptionsSelected;
        return this;
    }

    public int getTag() {
        return this.mTag;
    }

    public int getType() {
        return this.mType;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public T getValue() {
        return this.mValue;
    }

    public String getValueAsString() {
        return (this.mValue == null) ? "" : this.mValue.toString();
    }

    public String getHint() {
        return (this.mHint == null) ? "" : this.mHint;
    }

    public String getError() {
        return this.mError;
    }

    public boolean isRequired() {
        return this.mRequired;
    }

    public boolean isVisible() {
        return this.mVisible;
    }

    public List<T> getOptions() {
        return (this.mOptions == null) ? new ArrayList<T>() : this.mOptions;
    }

    public List<T> getOptionsSelected() {
        return (this.mOptionsSelected == null) ? new ArrayList<T>() : this.mOptionsSelected;
    }

    public boolean isHeader() {
        return false;
    }

    @Override
    public String toString() {
        return "TAG: " + String.valueOf(this.mTag) + ", TITLE: " + this.mTitle + ", VALUE: " + this.mValue + ", REQUIRED: " + String.valueOf(this.mRequired);
    }

}
