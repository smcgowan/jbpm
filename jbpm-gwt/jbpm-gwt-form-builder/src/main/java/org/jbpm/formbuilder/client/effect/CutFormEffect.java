/*
 * Copyright 2011 JBoss Inc 
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
package org.jbpm.formbuilder.client.effect;

import org.jbpm.formapi.client.CommonGlobals;
import org.jbpm.formapi.client.effect.FBFormEffect;
import org.jbpm.formbuilder.client.FormBuilderGlobals;

import com.gwtent.reflection.client.Reflectable;

/**
 * Allows the cut action from the right button menu
 */
@Reflectable
public class CutFormEffect extends FBFormEffect {

    public CutFormEffect() {
        super(FormBuilderGlobals.getInstance().getI18n().CutFormEffectLabel(), false);
    }
    
    @Override
    protected void createStyles() {
        CommonGlobals.getInstance().cut().append(getItem()).execute();
    }

}