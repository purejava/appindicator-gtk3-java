// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$422 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$422() {}
    static final VarHandle const$0 = constants$420.const$3.varHandle(MemoryLayout.PathElement.groupElement("v_string"));
    static final VarHandle const$1 = constants$420.const$3.varHandle(MemoryLayout.PathElement.groupElement("v_comment"));
    static final VarHandle const$2 = constants$420.const$3.varHandle(MemoryLayout.PathElement.groupElement("v_char"));
    static final VarHandle const$3 = constants$420.const$3.varHandle(MemoryLayout.PathElement.groupElement("v_error"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("cset_skip_characters"),
        RuntimeHelper.POINTER.withName("cset_identifier_first"),
        RuntimeHelper.POINTER.withName("cset_identifier_nth"),
        RuntimeHelper.POINTER.withName("cpair_comment_single"),
        MemoryLayout.paddingLayout(4),
        JAVA_INT.withName("padding_dummy")
    ).withName("_GScannerConfig");
    static final VarHandle const$5 = constants$422.const$4.varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"));
}

