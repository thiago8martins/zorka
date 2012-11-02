/**
 * Copyright 2012 Rafal Lewczuk <rafal.lewczuk@jitlogic.com>
 * <p/>
 * This is free software. You can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * <p/>
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this software. If not, see <http://www.gnu.org/licenses/>.
 */

package com.jitlogic.zorka.spy.transformers;

import com.jitlogic.zorka.spy.SpyRecord;

import java.util.regex.Pattern;

public class RegexFilterTransformer implements SpyTransformer {

    private final int arg;
    private final Pattern regex;
    private final boolean filterOut;

    public RegexFilterTransformer(int arg, String regex) {
        this(arg, regex, false);
    }

    public RegexFilterTransformer(int arg, String regex, boolean filterOut) {
        this.arg = arg;
        this.regex = Pattern.compile(regex);
        this.filterOut = filterOut;
    }

    public SpyRecord transform(SpyRecord record) {
        return record;
    }
}