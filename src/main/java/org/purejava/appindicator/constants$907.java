// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$907 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$907() {}
    static final FunctionDescriptor pango_font_description_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_free$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_free",
        constants$907.pango_font_description_free$FUNC
    );
    static final FunctionDescriptor pango_font_descriptions_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_font_descriptions_free$MH = RuntimeHelper.downcallHandle(
        "pango_font_descriptions_free",
        constants$907.pango_font_descriptions_free$FUNC
    );
    static final FunctionDescriptor pango_font_description_set_family$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_set_family$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_set_family",
        constants$907.pango_font_description_set_family$FUNC
    );
    static final FunctionDescriptor pango_font_description_set_family_static$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_set_family_static$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_set_family_static",
        constants$907.pango_font_description_set_family_static$FUNC
    );
    static final FunctionDescriptor pango_font_description_get_family$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_get_family$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_get_family",
        constants$907.pango_font_description_get_family$FUNC
    );
    static final FunctionDescriptor pango_font_description_set_style$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_font_description_set_style$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_set_style",
        constants$907.pango_font_description_set_style$FUNC
    );
}


