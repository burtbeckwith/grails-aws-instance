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
package ikakara.awsinstance.util

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;

/**
 *
 * @author Allen
 */
class PrintlnUtil {
  
  public static AmazonServiceException(String header, AmazonServiceException ase) {
    println header
    println("Caught an AmazonServiceException, which means your request made it "
      + "to Amazon S3, but was rejected with an error response for some reason.");
    println("Error Message:    " + ase.getMessage());
    println("HTTP Status Code: " + ase.getStatusCode());
    println("AWS Error Code:   " + ase.getErrorCode());
    println("Error Type:       " + ase.getErrorType());
    println("Request ID:       " + ase.getRequestId());
  }
	
  public static AmazonClientException(String header, AmazonClientException ace) {
    println header
    println("Caught an AmazonClientException, which means the client encountered "
      + "a serious internal problem while trying to communicate with S3, "
      + "such as not being able to access the network.");
    println("Error Message: " + ace.getMessage());
  }
}

