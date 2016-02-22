/*
 * Copyright 2015 - 2016 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.aeron.driver;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

public class ValuesSupplier extends ParameterSupplier
{
    public List<PotentialAssignment> getValueSources(final ParameterSignature sig)
    {
        final List<PotentialAssignment> list = new ArrayList<>();
        final Values testedOn = sig.getAnnotation(Values.class);
        final String[] values = testedOn.value();

        for (final String s : values)
        {
            list.add(PotentialAssignment.forValue("value", s));
        }

        return list;
    }
}
