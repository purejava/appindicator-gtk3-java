// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$3323 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3323() {}
    static final VarHandle const$0 = constants$3322.const$4.varHandle(MemoryLayout.PathElement.groupElement("create_rc_style"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GtkRcStyleClass.parse.class, "apply", constants$12.const$2);
    static final VarHandle const$2 = constants$3322.const$4.varHandle(MemoryLayout.PathElement.groupElement("parse"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkRcStyleClass.merge.class, "apply", constants$13.const$4);
    static final VarHandle const$4 = constants$3322.const$4.varHandle(MemoryLayout.PathElement.groupElement("merge"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkRcStyleClass.create_style.class, "apply", constants$5.const$2);
}

