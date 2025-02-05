/*
 * Copyright 2022 DroidconKE
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
package com.android254.domain.models

data class OrganizerDomainModel(
    val id: Int?,
    val name: String?,
    val email: String?,
    val description: String?,
    val facebook: String?,
    val twitter: String?,
    val instagram: String?,
    val logo: String?,
    val slug: String?,
    val status: String?,
    val createdAt: String?,
    val creater: CreatorDomainModel?,
    val upcomingEventsCount: Int?,
    val totalEventsCount: Int?
)

data class CreatorDomainModel(
    val id: Int?,
    val name: String?,
    val email: String?,
    val createdAt: String?
)