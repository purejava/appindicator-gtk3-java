// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1414 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1414() {}
    static final FunctionDescriptor gtk_text_iter_set_visible_line_index$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_iter_set_visible_line_index$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_set_visible_line_index",
        constants$1414.gtk_text_iter_set_visible_line_index$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_forward_to_tag_toggle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_forward_to_tag_toggle$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_forward_to_tag_toggle",
        constants$1414.gtk_text_iter_forward_to_tag_toggle$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_backward_to_tag_toggle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_backward_to_tag_toggle$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_backward_to_tag_toggle",
        constants$1414.gtk_text_iter_backward_to_tag_toggle$FUNC
    );
    static final FunctionDescriptor GtkTextCharPredicate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkTextCharPredicate_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTextCharPredicate_UP$MH = RuntimeHelper.upcallHandle(GtkTextCharPredicate.class, "apply", constants$1414.GtkTextCharPredicate_UP$FUNC);
    static final FunctionDescriptor GtkTextCharPredicate_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTextCharPredicate_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1414.GtkTextCharPredicate_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_forward_find_char$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_forward_find_char$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_forward_find_char",
        constants$1414.gtk_text_iter_forward_find_char$FUNC
    );
}


