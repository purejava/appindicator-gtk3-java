// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1421 {

    static final FunctionDescriptor atk_table_cell_get_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_position$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_position",
        constants$1421.atk_table_cell_get_position$FUNC
    );
    static final FunctionDescriptor atk_table_cell_get_row_span$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_row_span$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_row_span",
        constants$1421.atk_table_cell_get_row_span$FUNC
    );
    static final FunctionDescriptor atk_table_cell_get_row_header_cells$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_row_header_cells$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_row_header_cells",
        constants$1421.atk_table_cell_get_row_header_cells$FUNC
    );
    static final FunctionDescriptor atk_table_cell_get_row_column_span$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_row_column_span$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_row_column_span",
        constants$1421.atk_table_cell_get_row_column_span$FUNC
    );
    static final FunctionDescriptor atk_table_cell_get_table$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_table$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_table",
        constants$1421.atk_table_cell_get_table$FUNC
    );
    static final  OfAddress atk_misc_instance$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle atk_misc_instance$VH = constants$1421.atk_misc_instance$LAYOUT.varHandle();
    static final MemorySegment atk_misc_instance$SEGMENT = RuntimeHelper.lookupGlobalVariable("atk_misc_instance", constants$1421.atk_misc_instance$LAYOUT);
}


