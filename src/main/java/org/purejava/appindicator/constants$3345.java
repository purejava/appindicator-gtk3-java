// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$3345 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3345() {}
    static final VarHandle const$0 = constants$3343.const$3.varHandle(MemoryLayout.PathElement.groupElement("property_cache"));
    static final VarHandle const$1 = constants$3343.const$3.varHandle(MemoryLayout.PathElement.groupElement("icon_factories"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                JAVA_LONG.withName("g_type")
            ).withName("g_type_class"),
            RuntimeHelper.POINTER.withName("construct_properties"),
            RuntimeHelper.POINTER.withName("constructor"),
            RuntimeHelper.POINTER.withName("set_property"),
            RuntimeHelper.POINTER.withName("get_property"),
            RuntimeHelper.POINTER.withName("dispose"),
            RuntimeHelper.POINTER.withName("finalize"),
            RuntimeHelper.POINTER.withName("dispatch_properties_changed"),
            RuntimeHelper.POINTER.withName("notify"),
            RuntimeHelper.POINTER.withName("constructed"),
            JAVA_LONG.withName("flags"),
            JAVA_LONG.withName("n_construct_properties"),
            RuntimeHelper.POINTER.withName("pspecs"),
            JAVA_LONG.withName("n_pspecs"),
            MemoryLayout.sequenceLayout(3, RuntimeHelper.POINTER).withName("pdummy")
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("realize"),
        RuntimeHelper.POINTER.withName("unrealize"),
        RuntimeHelper.POINTER.withName("copy"),
        RuntimeHelper.POINTER.withName("clone"),
        RuntimeHelper.POINTER.withName("init_from_rc"),
        RuntimeHelper.POINTER.withName("set_background"),
        RuntimeHelper.POINTER.withName("render_icon"),
        RuntimeHelper.POINTER.withName("draw_hline"),
        RuntimeHelper.POINTER.withName("draw_vline"),
        RuntimeHelper.POINTER.withName("draw_shadow"),
        RuntimeHelper.POINTER.withName("draw_arrow"),
        RuntimeHelper.POINTER.withName("draw_diamond"),
        RuntimeHelper.POINTER.withName("draw_box"),
        RuntimeHelper.POINTER.withName("draw_flat_box"),
        RuntimeHelper.POINTER.withName("draw_check"),
        RuntimeHelper.POINTER.withName("draw_option"),
        RuntimeHelper.POINTER.withName("draw_tab"),
        RuntimeHelper.POINTER.withName("draw_shadow_gap"),
        RuntimeHelper.POINTER.withName("draw_box_gap"),
        RuntimeHelper.POINTER.withName("draw_extension"),
        RuntimeHelper.POINTER.withName("draw_focus"),
        RuntimeHelper.POINTER.withName("draw_slider"),
        RuntimeHelper.POINTER.withName("draw_handle"),
        RuntimeHelper.POINTER.withName("draw_expander"),
        RuntimeHelper.POINTER.withName("draw_layout"),
        RuntimeHelper.POINTER.withName("draw_resize_grip"),
        RuntimeHelper.POINTER.withName("draw_spinner"),
        RuntimeHelper.POINTER.withName("_gtk_reserved1"),
        RuntimeHelper.POINTER.withName("_gtk_reserved2"),
        RuntimeHelper.POINTER.withName("_gtk_reserved3"),
        RuntimeHelper.POINTER.withName("_gtk_reserved4"),
        RuntimeHelper.POINTER.withName("_gtk_reserved5"),
        RuntimeHelper.POINTER.withName("_gtk_reserved6"),
        RuntimeHelper.POINTER.withName("_gtk_reserved7"),
        RuntimeHelper.POINTER.withName("_gtk_reserved8"),
        RuntimeHelper.POINTER.withName("_gtk_reserved9"),
        RuntimeHelper.POINTER.withName("_gtk_reserved10"),
        RuntimeHelper.POINTER.withName("_gtk_reserved11")
    ).withName("_GtkStyleClass");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkStyleClass.realize.class, "apply", constants$13.const$1);
    static final VarHandle const$4 = constants$3345.const$2.varHandle(MemoryLayout.PathElement.groupElement("realize"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkStyleClass.unrealize.class, "apply", constants$13.const$1);
}

