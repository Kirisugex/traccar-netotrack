/*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

Ext.define('Traccar.view.dialog.RegisterController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.register',

    onCreateClick: function () {
        var form = this.lookupReference('form');
        if (form.isValid()) {
            Ext.Ajax.request({
                scope: this,
                method: 'POST',
                url: 'api/users',
                jsonData: form.getValues(),
                callback: this.onCreateReturn
            });
        }
    },

    onCreateReturn: function (options, success, response) {
        if (success) {
            this.closeView();
            Traccar.app.showToast(Strings.loginCreated);
        } else {
            Traccar.app.showError(response);
        }
    }

});
