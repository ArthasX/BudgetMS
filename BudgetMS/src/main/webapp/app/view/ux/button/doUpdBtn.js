Ext.define('BudgetMS.view.ux.button.doUpdBtn', {
	extend : 'BudgetMS.view.ux.button.baseBtn',
	alias:'widget.doUpdBtn',
	listeners : {
		'click' : function(btn, e, eOpts) {
			var win=btn.up('window');
			var record = win.down('form').getForm().getFieldValues();
			var tabpanel = Ext.getCmp('mainTabpanel');
			var tab = tabpanel.getActiveTab();
			var url = btn.action;// btn action 传参数 inst invo cont?
			var grid = tab.down('gridview');
			this.doCRUDAjax(record, url, grid,win);
		}
	}
});