/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * you may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.okta.client;

public class OktaConstants {
    public static final String UTF_8 = "UTF-8";
    public static final String HTTP_HEADER_CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";

    public static final String AUTHORIZATION = "Authorization";
    public static final String AUTHENTICATION_BEARER = "Bearer ";
    public static final String AUTHENTICATION_BASIC = "Basic ";
    public static final String AUTHENTICATION_SSWS = "SSWS ";

    public static final String GRANT_TYPE = "grant_type";
    public static final String GRANT_TYPE_CLIENT_CREDENTIALS = "client_credentials";

    public static final String ACCESS_TOKEN_SCOPE = "scope";

    public static final String ERROR_MSG_ENCODING_NOT_SUPPORTED = "The Character Encoding is not supported. ";
    public static final String ERROR_MSG_ERROR_WHILE_PARSING = "Error while parsing response json ";
    public static final String ERROR_MSG_ERROR_WHILE_READING = "Error while reading response body from server";


    public static final String CLIENT_REGISTRATION_ENDPOINT = "RegistrationEndpoint";
    public static final String CLIENT_REVOKE_ENDPOINT = "RevokeEndpoint";
    public static final String REGISTRAION_API_KEY = "AccessToken";
    public static final String CLIENT_REDIRECT_URIS = "redirect_uris";
    public static final String CLIENT_GRANT_TYPES = "grant_types";
    public static final String CLIENT_NAME = "client_name";
    public static final String CLIENT_ID = "client_id";
    public static final String CLIENT_SECRET = "client_secret";
    public static final String CLIENT_TOKEN_ENDPOINT_AUTH_METHOD = "token_endpoint_auth_method";
    public static final String CLIENT_APPLICATION_TYPE = "application_type";
    public static final String CLIENT_RESPONSE_TYPES = "response_types";
    public static final String CLIENT_LOGO_URI = "logo_uri";
    public static final String CLIENT_URI = "client_uri";
    public static final String CLIENT_INITIATE_LOGIN_URI = "initiate_login_uri";
    public static final String CLIENT_POST_LOGOUT_REDIRECT_URIS = "post_logout_redirect_uris";
    public static final String CLIENT_ID_ISSUED_AT = "client_id_issued_at";
    public static final String CLIENT_SECRET_EXPIRES_AT = "client_secret_expires_at";
    public static final String INTROSPECTION_ENDPOINT = "introspectionEndpoint";
    public static final String TOKEN = "token";
    public static final String TOKEN_TYPE_HINT = "token_type_hint";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String ACCESS_TOKEN_ACTIVE = "active";
    public static final String ACCESS_TOKEN_EXPIRY = "exp";
    public static final String ACCESS_TOKEN_ISSUED = "iat";
    public static final String ACCESS_TOKEN_USER_NAME = "username";
    public static final String ACCESS_TOKEN_AUDIENCE = "aud";
    public static final String ACCESS_TOKEN_ISSUER = "iss";
    public static final String ACCESS_TOKEN_TYPE = "token_type";
    public static final String ACCESS_TOKEN_SUBJECT = "sub";
    public static final String ACCESS_TOKEN_USER_ID = "uid";
    public static final String ACCESS_TOKEN_IDENTIFIER = "jti";
    public static final String ACCESS_TOKEN_EXPIRES_IN = "expires_in";

}
