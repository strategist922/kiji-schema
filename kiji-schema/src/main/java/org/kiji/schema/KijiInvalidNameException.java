/**
 * (c) Copyright 2012 WibiData, Inc.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kiji.schema;

import org.kiji.annotations.ApiAudience;

/**
 * Thrown when a Kiji instance or table layout name is invalid.
 */
@ApiAudience.Public
public final class KijiInvalidNameException extends RuntimeException {
  /**
   * Creates a new <code>KijiInvalidNameException</code> with the specified detail message.
   *
   * @param message The exception message.
   */
  public KijiInvalidNameException(String message) {
    super(message);
  }
}
