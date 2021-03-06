/*
 * Copyright 2017 Jiupeng Zhang
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

package com.codeager.ecom.dto.view;

/**
 * @author Jiupeng Zhang
 * @since 12/22/2017
 */
public class RegularRestResponse {
    public static final RestResponse WELCOME = $.restful()
            .message("Welcome to EAC").data()
            .child("api")
            .put("version", "1.0")
            .put("documentation_url", "https://doc.codeager.io/api?group=ecom")
            .put("author", "https://github.com/zhangjiupeng")
            .child("ref").parent()
            .parent()
            .child("project")
            .put("name", "Codeager IO")
            .put("development_team", "https://github.com/codeager")
            .ready().asRestResponse();
}
