// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1724 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1724() {}
    static final FunctionDescriptor gtk_page_setup_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_page_setup_new$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_new",
        constants$1724.gtk_page_setup_new$FUNC
    );
    static final FunctionDescriptor gtk_page_setup_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_page_setup_copy$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_copy",
        constants$1724.gtk_page_setup_copy$FUNC
    );
    static final FunctionDescriptor gtk_page_setup_get_orientation$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_page_setup_get_orientation$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_get_orientation",
        constants$1724.gtk_page_setup_get_orientation$FUNC
    );
    static final FunctionDescriptor gtk_page_setup_set_orientation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_page_setup_set_orientation$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_set_orientation",
        constants$1724.gtk_page_setup_set_orientation$FUNC
    );
    static final FunctionDescriptor gtk_page_setup_get_paper_size$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_page_setup_get_paper_size$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_get_paper_size",
        constants$1724.gtk_page_setup_get_paper_size$FUNC
    );
    static final FunctionDescriptor gtk_page_setup_set_paper_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_page_setup_set_paper_size$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_set_paper_size",
        constants$1724.gtk_page_setup_set_paper_size$FUNC
    );
}


