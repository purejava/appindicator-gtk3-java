// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$138 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$138() {}
    static final VarHandle const$0 = constants$137.const$3.varHandle(MemoryLayout.PathElement.groupElement("pstate"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(32, MemoryLayout.paddingLayout(16).withName("__int128")).withName("vregs"),
        JAVA_INT.withName("fpsr"),
        JAVA_INT.withName("fpcr"),
        MemoryLayout.paddingLayout(8)
    ).withName("user_fpsimd_struct");
    static final VarHandle const$2 = constants$138.const$1.varHandle(MemoryLayout.PathElement.groupElement("fpsr"));
    static final VarHandle const$3 = constants$138.const$1.varHandle(MemoryLayout.PathElement.groupElement("fpcr"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("si_signo"),
        JAVA_INT.withName("si_code"),
        JAVA_INT.withName("si_errno")
    ).withName("elf_siginfo");
    static final VarHandle const$5 = constants$138.const$4.varHandle(MemoryLayout.PathElement.groupElement("si_signo"));
}

