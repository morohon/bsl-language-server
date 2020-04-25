/*
 * This file is a part of BSL Language Server.
 *
 * Copyright © 2018-2020
 * Alexey Sosnoviy <labotamy@gmail.com>, Nikita Gryzlov <nixel2007@gmail.com> and contributors
 *
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 * BSL Language Server is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * BSL Language Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with BSL Language Server.
 */
package com.github._1c_syntax.bsl.languageserver.context.symbol.annotations;

import com.github._1c_syntax.bsl.parser.BSLParser;

import java.util.Optional;
import java.util.stream.Stream;

public enum CompilerDirective {
  AT_SERVER_NO_CONTEXT(BSLParser.ANNOTATION_ATSERVERNOCONTEXT_SYMBOL),
  AT_CLIENT_AT_SERVER_NO_CONTEXT(BSLParser.ANNOTATION_ATSERVERNOCONTEXT_SYMBOL),
  AT_CLIENT_AT_SERVER(BSLParser.ANNOTATION_ATCLIENTATSERVER_SYMBOL),
  AT_CLIENT(BSLParser.ANNOTATION_ATCLIENT_SYMBOL),
  AT_SERVER(BSLParser.ANNOTATION_ATSERVER_SYMBOL);

  private final int tokenType;

  CompilerDirective(int tokenType) {
    this.tokenType = tokenType;
  }

  public int getTokenType() {
    return tokenType;
  }

  public static Optional<CompilerDirective> of(int tokenType){
    return Stream.of(values())
      .filter(compilerDirective -> compilerDirective.getTokenType() == tokenType)
      .findAny();
  }
}
