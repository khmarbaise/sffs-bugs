package com.soebes.youtube.maven.episodes.ep3.jupiter;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import static org.assertj.core.api.Assertions.assertThat;

import com.soebes.youtube.maven.episodes.ep3.Fraction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FractionJUnitJupiterTest {

  @BeforeAll
  static void beforeAll() {
    System.out.println("FractionJUnitJupiterTest.beforeAll");
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("FractionJUnitJupiterTest.beforeEach");
  }

  @AfterEach
  void afterEach() {
    System.out.println("FractionJUnitJupiterTest.afterEach");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("FractionJUnitJupiterTest.afterAll");
  }

  @Test
  void first_add() {
    System.out.println("FractionJUnitJupiterTest.first_add");
    Fraction sum1 = new Fraction(5);
    Fraction sum2 = new Fraction(2);

    assertThat(sum1.add(sum2)).isEqualTo(new Fraction(7));
  }

}
