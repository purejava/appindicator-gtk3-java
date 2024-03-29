// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef struct elf_prpsinfo {
 *     char pr_state;
 *     char pr_sname;
 *     char pr_zomb;
 *     char pr_nice;
 *     unsigned long pr_flag;
 *     __pr_uid_t pr_uid;
 *     __pr_gid_t pr_gid;
 *     int pr_pid;
 *     int pr_ppid;
 *     int pr_pgrp;
 *     int pr_sid;
 *     char pr_fname[16];
 *     char pr_psargs[80];
 * } prpsinfo_t
 * }
 */
public class prpsinfo_t extends elf_prpsinfo {

    prpsinfo_t() {
        // Should not be called directly
    }
}

