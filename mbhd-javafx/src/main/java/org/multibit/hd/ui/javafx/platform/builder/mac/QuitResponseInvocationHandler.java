/**
 * Copyright 2011 multibit.org
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.multibit.hd.ui.javafx.platform.builder.mac;

import org.multibit.hd.ui.javafx.platform.handler.GenericQuitHandler;
import org.multibit.hd.ui.javafx.platform.listener.GenericQuitResponse;

/**
 * <p>Implementation of invocation handler for Quit response</p>
 */
public class QuitResponseInvocationHandler extends BaseMacInvocationHandler<GenericQuitHandler, GenericQuitResponse> {

  QuitResponseInvocationHandler(GenericQuitHandler genericHandler, Class<GenericQuitResponse> genericEventClass) {
    super(genericHandler, genericEventClass);
  }
}
