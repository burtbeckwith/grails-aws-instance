/* Copyright 2014-2015 Allen Arakaki.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ikakara.awsinstance.command

import groovy.transform.ToString
import grails.validation.Validateable

/**
 * @author Allen
 */
@ToString(includePackage=false, ignoreNulls=true)
@Validateable(nullable=true)
class EmailStatsCommand {

  String timestamp
  String attempts
  String rejects
  String complaints
  String bounces

  EmailStatsCommand(String ts, String at, String re, String co, String bo) {
    timestamp = ts
    attempts = at
    rejects = re
    complaints = co
    bounces = bo
  }
}
