// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1770 {

    static final FunctionDescriptor gtk_file_chooser_add_shortcut_folder_uri$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_add_shortcut_folder_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_add_shortcut_folder_uri",
        constants$1770.gtk_file_chooser_add_shortcut_folder_uri$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_remove_shortcut_folder_uri$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_remove_shortcut_folder_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_remove_shortcut_folder_uri",
        constants$1770.gtk_file_chooser_remove_shortcut_folder_uri$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_list_shortcut_folder_uris$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_list_shortcut_folder_uris$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_list_shortcut_folder_uris",
        constants$1770.gtk_file_chooser_list_shortcut_folder_uris$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_add_choice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_add_choice$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_add_choice",
        constants$1770.gtk_file_chooser_add_choice$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_remove_choice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_remove_choice$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_remove_choice",
        constants$1770.gtk_file_chooser_remove_choice$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_set_choice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_choice$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_choice",
        constants$1770.gtk_file_chooser_set_choice$FUNC
    );
}


