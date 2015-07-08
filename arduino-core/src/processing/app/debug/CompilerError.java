/* -*- mode: java; c-basic-offset: 2; indent-tabs-mode: nil -*- */

/*
 Part of the Processing project - http://processing.org

 Copyright (c) 2004-08 Ben Fry and Casey Reas
 Copyright (c) 2001-04 Massachusetts Institute of Technology

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package processing.app.debug;

/**
 * An error with a line number attached that occurs during either compile time.
 * @author Ricardo JL Rufino (ricardo@criativasoft.com.br) 
 */
public class CompilerError {

  public CompilerError(String message, int line, String fileName) {
    super();
    this.message = message;
    this.line = line;
    this.fileName = fileName;
  }

  private int line;
  private String message;
  private String fileName;

  public int getLine() {
    return line;
  }

  public String getMessage() {
    return message;
  }

  public String getFileName() {
    return fileName;
  }

}