// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2004 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2004() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "atk_component_scroll_to_point",
        constants$608.const$5
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("get_document_type"),
        RuntimeHelper.POINTER.withName("get_document"),
        RuntimeHelper.POINTER.withName("get_document_locale"),
        RuntimeHelper.POINTER.withName("get_document_attributes"),
        RuntimeHelper.POINTER.withName("get_document_attribute_value"),
        RuntimeHelper.POINTER.withName("set_document_attribute"),
        RuntimeHelper.POINTER.withName("get_current_page_number"),
        RuntimeHelper.POINTER.withName("get_page_count")
    ).withName("_AtkDocumentIface");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_AtkDocumentIface.get_document_type.class, "apply", constants$5.const$2);
    static final VarHandle const$3 = constants$2004.const$1.varHandle(MemoryLayout.PathElement.groupElement("get_document_type"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_AtkDocumentIface.get_document.class, "apply", constants$5.const$2);
    static final VarHandle const$5 = constants$2004.const$1.varHandle(MemoryLayout.PathElement.groupElement("get_document"));
}


