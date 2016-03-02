Ext.define('BudgetMS.view.ux.button.doAddBtn', {
	extend : 'BudgetMS.view.ux.button.baseBtn',
	alias:'widget.doAddBtn',
	listeners : {
		'click' : function(btn, e, eOpts) {
			//debugger;
			var win=btn.up('window');
			var form =win.down('form').getForm();
			if(!form.isValid()){
				Ext.Msg.alert('注意','红框处不能为空');
				return;
			}
			var record = form.getFieldValues();
			console.log(record);
			var tabpanel = Ext.getCmp('mainTabpanel');
			var tab = tabpanel.getActiveTab();
			var grid = tab.down('gridview');
			var url = btn.action;
			this.doCRUDAjax(record, url, grid,win);
		}
	}
});