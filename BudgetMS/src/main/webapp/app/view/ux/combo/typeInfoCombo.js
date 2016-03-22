Ext.define('BudgetMS.view.ux.combo.typeInfoCombo', {
	extend : 'Ext.form.field.ComboBox',
	alias : 'widget.typeInfoCombo',
	allowBlank : false,
	// fieldLabel : '请示类型',
	valueField : 'typeId',
	displayField : 'typeName',
	store : 'typeInfoStore',
	listeners : {
		// combo展开的时候给sotre加上filter expand
		'expand' : function() {	 
			var category = this.category;
			this.store.filterBy(function(record) {//debugger;
				return record.get('typeCategory') == category;
			});
		},
		'select' : function() {
			this.store.clearFilter();
		},
		'activate':function(){
			this.fireEvent('expand');
		}
	}
})