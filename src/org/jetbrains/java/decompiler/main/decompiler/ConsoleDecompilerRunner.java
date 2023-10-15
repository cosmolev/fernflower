// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.java.decompiler.main.decompiler;

public class ConsoleDecompilerRunner {

  public static void main(String[] args) {
    ConsoleDecompiler.main(new String[]{
      "-dgs=true",
      "/path/to/jar/file.jar",
      "/path/to/output/folder"
    });
  }

}
